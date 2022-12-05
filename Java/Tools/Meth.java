package Tools;

public class Meth {
    public static int numberOfDigits(int num) {
        int digits = 0;
        while(Math.abs(num) > 1) {
            num /= 10;
            digits++;
        }
        return digits;
    }

    public static double numberOfDigits(Long num) {
        int digits = 0;
        while(Math.abs(num) > 1) {
            num /= 10;
            digits++;
        }
        return digits;
    }

}
