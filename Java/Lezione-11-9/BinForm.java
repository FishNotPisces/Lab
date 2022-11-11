import java.util.Scanner;

public class BinForm {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        byte _num;
        
        try {
            _num = input.nextByte();
        }
        catch (Exception e) {
            _num = 0;
            System.out.println("Error");
        }
        
        int num = _num;
        
        String sign = "0";
        if (num < 0) {
            sign = "1";
            num = 128 + num + 128;
        }
        
        String numBin = "";
        
        while (num > 0) {
            if (numBin.length() > 2 && numBin.length()%4 == 0) {
                numBin = "_" + numBin;
            }
            numBin = Integer.toString(num%2) + numBin;
            num /= 2;
        }
        
        numBin = sign + " / " + numBin;

        System.out.printf("0b%s%n", numBin); 
    }
}
