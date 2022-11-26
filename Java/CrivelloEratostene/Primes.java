package CrivelloEratostene;

public class Primes {
    public static void main(String[] args) {
        int N;
        try {
            N = Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            N = 20;
        }

        N -= 2;
        int[] primeList = new int[N];
        
        for (int i = 0; i<N; i++) {
            primeList[i] = i+2;
        }

        for (int c = 2; c*c < N; c++) {
            if (primeList[c] == 0) {
                continue;
            }
            for (int j = c; j<N; j++) {
                if (primeList[j]%c == 0) {
                    primeList[j] = 0;
                }
            }
        }

        for (int i = 0; i<N; i++) {
            if (primeList[i] == 0) continue;
            System.out.println(primeList[i]);
        }

    }
}
