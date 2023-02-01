package StudentContainer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortedContainerTester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileIn = new FileReader(args[0]);
        PrintWriter fileOut = new PrintWriter(args[1]);
        Scanner in = new Scanner(fileIn);

        SortedContainer register = new SortedContainer();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner row = new Scanner(line);
            row.useDelimiter(":");

            String name = row.next();
            String matr = row.next();
            Student s = new Student(name, Integer.parseInt(matr));
            register.add(s);

            row.close();
        }
        
        in.close();
        fileIn.close();
        
        while(!register.isEmpty()) {
            fileOut.println(register.removeMax());
        }

        fileOut.close();
    }
}
