package DynamicArrays;

import java.util.Scanner;

public class DynamicTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoubleArray arr = new DoubleArray();
        String next = in.nextLine();
        while (!next.equals("end")) {
            arr.append(Double.parseDouble(next));
            next = in.nextLine();
        }
        in.close();
        System.out.println(arr.toString());
    }
}
