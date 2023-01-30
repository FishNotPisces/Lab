package Containers.StudentContainer;

import java.util.NoSuchElementException;

public class SortedContainer implements Container {
        /*
       Costruisce un contenitore vuoto
    */
    public SortedContainer()
    {
        this.collection = new Comparable[1];
        this.itemCount = 0;
    } //completare

    public boolean isEmpty() {
        for (Comparable item : collection) {
            if (item != null) return false;
        }
        return true;
    }

    public void makeEmpty() {
        for (Comparable item : collection) {
            item = null;
        }
    }

    /*
        Aggiunge l'elemento compObj, ridimensionando l'array se necessario.
        L'elemento viene inserito in coda all'array e successivamente l'array
        viene ordinato. Andamento asintotico O(n) (prima dell'inserimento 
        l'array e' ordinato!)
    */
    public void add(Comparable newItem)
    {
        if (this.collection.length >= this.itemCount-1) {
            this.collection = resize(this.collection, this.collection.length*2);
        }
        for (int i=this.itemCount-1; i>= 0; i--) {
            if (newItem.compareTo(this.collection[i]) > 0) {
                this.collection[i+1] = this.collection[i];
                this.collection[i] = null;
            }
            else {
                this.collection[i] = newItem;
            }
        }
        itemCount++;
    }

    private Comparable[] resize(Comparable[] oldAr, int newLength)
    {
        Comparable[] tmp = new Comparable[newLength];
        System.arraycopy(this.collection, 0, tmp, 0, this.collection.length);
        return tmp;
    }

    /*
        restituisce il valore massimo del contenitore (massimo nel senso 
        definito dal metodo compareTo()), e lo cancella dal contenitore. 
        Andamento asintotico O(1).
        Lancia NoSuchElementException se l'array e' vuoto
    */
    public Comparable removeMax() throws NoSuchElementException
    {
        Comparable max = this.collection[0];
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            max = this.collection[itemCount];
        }

        return max;
    } //completare

    private Comparable[] collection;
    private int itemCount;


}
