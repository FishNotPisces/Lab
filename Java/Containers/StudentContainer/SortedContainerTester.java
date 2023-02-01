package StudentContainer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SortedContainerTester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileIn = new FileReader(args[0]);
        FileWriter fileOut = new FileWriter(args[1]);
        Scanner in = new Scanner(fileIn);

        Student s;
        SortedContainer register = new SortedContainer();

        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner row = new Scanner(line);
            row.useDelimiter(":");
            String name = row.next();
            String matr = row.next();
            s = new Student(name, Integer.parseInt(matr));
            register.add(s);
        }

        //System.out.println(register.toString());

    }
}
