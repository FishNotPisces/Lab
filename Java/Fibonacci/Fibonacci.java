package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        System.out.println(iterativeFib(num));
    }

    public static long recursiveFib (int n) {
        if (n == 1 || n == 0) return 1;
        return recursiveFib(n-2) + recursiveFib(n-1);
    }

    public static Long iterativeFib (int n) {
        Long num = Long.valueOf(1);
        Long pre_num = Long.valueOf(1);
        Long pre_pre_num;
        for (int i=0; i<n; i++) {
            pre_pre_num = pre_num;
            pre_num = num;
            num = pre_pre_num + pre_num;
        }
        return num;
    }
}
