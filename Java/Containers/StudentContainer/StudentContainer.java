package StudentContainer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentContainer extends SortedContainer
{
    /*
      Costruisce un contenitore vuoto
    */
    public StudentContainer()
    {
        this.collection = new Student[1];
        this.itemCount = 0;
    } //completare

    /*
      Costruisce un contenitore e vi inserisce oggetti di tipo Student
      usando i dati letti dal file filename, nel formato nome:matricola
    */
    public StudentContainer(String filename) throws IOException
    {
        this.collection = new Student[1];
        this.itemCount = 0;
        FileReader fileIn = new FileReader(filename);
        Scanner list = new Scanner(fileIn);
        while (list.hasNextLine()) {
            String line = list.nextLine();
            Scanner row = new Scanner(line);
            row.useDelimiter(":");
            String name = row.next();
            String matr = row.next();
            Student s = new Student(name, Integer.parseInt(matr));
            this.add(s);
            row.close();
        }
        list.close();
        fileIn.close();
    } //completare

    /*
        Inserisce il nuovo oggetto compObj di tipo Student nel contenitore. 
        Questo metodo sovrascrive il metodo omonimo di SortedContainer. Se  
        l'oggetto compObj non e` di tipo Student il metodo deve lanciare
        IllegalArgumentException. Per il resto il comportamento del metodo e` 
        identico a quello del metodo omonimo di SortedContainer
    */
    public void add(Comparable newItem)
    {
        if (!(newItem instanceof Comparable)) throw new IllegalArgumentException();

        if (this.collection.length == this.itemCount) {
            this.collection = (Student[]) resize(this.collection, this.collection.length*2);
        }
        this.collection[this.itemCount] = (Student)newItem;
        for (int i=this.itemCount; i>= 0; i--) {
            if (newItem.compareTo(this.collection[i]) < 0) {
                this.collection[i+1] = this.collection[i];
                this.collection[i] = (Student)newItem;
            }
        }
        this.itemCount++;
        return;
    } //completare

    /*
        Crea un nuovo oggetto Student con il nome n e la matricola m, e 
        successivamente lo inserisce nel contenitore con le stesse modalita`
        del metodo add(Comparable compObj)
    */
    public void add(String n, int m)
    {
        Student s = new Student(n, m);
        this.add(s);
        return;
    } //completare

    private Student[] collection;
    private int itemCount;
}
