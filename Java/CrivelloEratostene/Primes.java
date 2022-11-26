package CrivelloEratostene;

public class Primes {
    static int N = 30;
    public static void main(String[] args) {
        int[] primeList = new int[N-2];
    }

    public void crivello (int[] primeList, int count) {
        for (int i = 0; i < N-2; i++) {
            if (primeList[i]%2 == 0) {
                primeList[i] = 0;
            }
        }
    }
}
