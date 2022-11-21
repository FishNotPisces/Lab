import java.util.Scanner;

public class Divisori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int factor = 2;
        while (num != 1) {
            boolean isPrime = true;
            int i = 2;
            while (isPrime && i*i <= factor) {
                isPrime = factor % i != 0;
                i++;
            }
            if (num % factor == 0) {
                num /= factor;
                System.out.println(factor);
            }
            else {
                factor++;
            }
        }
    }
}