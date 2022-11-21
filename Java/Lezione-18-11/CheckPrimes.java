import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        int num;
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }

        boolean isPrime = true;

        int i = 2;
        while ( i*i <= num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++; // i = i + 1   oppure   i += 1
        }

        if (isPrime) {
            System.out.println(num + " e' un numero primo");
        }
        else {
            System.out.println(num + " e' divisibile per " + i);
        }
    }
}