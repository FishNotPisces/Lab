package CrivelloEratostene;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt()+1;
        in.close();

        boolean[] primeList = new boolean[N];

        for (int c = 2; c*c < N; c++) {
            if (primeList[c]) {
                continue;
            }
            for (int j = c+1; j<N; j++) {
                if (j%c == 0) {
                    primeList[j] = true;
                }
            }
        }

        for (int i = 2; i<N; i++) {
            if (primeList[i]) continue;
            System.out.print(i + " ");
        }
    }
}
