package RecNumberPrinter;

import java.util.Scanner;

public class RecNumberPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        String list = listNumbers(num);
        System.out.println(list);

    }

    public static String listNumbers(int num) {
        String s = " ";
        if (num == 0) return "";
        s = listNumbers(num-1) + num + s;
        return s;
    }
}
