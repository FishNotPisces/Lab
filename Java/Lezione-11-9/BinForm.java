import java.util.Scanner;

public class BinForm {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Inserisci un numero intero esprimibile in 8 bit");
            num = input.nextShort();
        }while (num > 127 || num < -128);

        if (num < 0) {num += 256;}

        String numBin = "";

        for (int i = 0; i < 8; i++) {
            if (i == 4) {numBin = "_" + numBin;}
            numBin = Integer.toString(num%2) + numBin;
            num /= 2;
        }

        System.out.printf("0b%s%n", numBin);
    }
}
