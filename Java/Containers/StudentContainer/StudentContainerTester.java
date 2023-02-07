package StudentContainer;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentContainerTester {
    public static void main (String[] args) throws IOException {
        StudentContainer register = new StudentContainer(args[0]);
        System.out.println("-debug- "+ register.toString());
        PrintWriter fileOut = new PrintWriter(args[1]);

        while (!register.isEmpty()) {
            fileOut.println((Student)register.removeMax());
        }

        fileOut.close();
    }
}
