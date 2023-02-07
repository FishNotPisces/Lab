package Stack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StackTester {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayStack pila = new ArrayStack();
        PrintWriter fileout = new PrintWriter(args[0]);

        while (in.hasNextLine()) {
            pila.push(in.nextLine());
        }

        while (!pila.isEmpty()) {
            fileout.println(pila.pop());
        }
        in.close();
        fileout.close();
    }
}
