package Quadratic;
import java.util.Scanner;
public class QuadraticTester {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            QuadraticEquation quadratic = new QuadraticEquation(in.nextInt(), in.nextInt(), in.nextInt());

            System.out.println(quadratic.hasSolutions());
            System.out.println(quadratic.getSolution1());
            System.out.println(quadratic.getSolution2());
        }
    }
}
