package StringRotator;

import java.util.Scanner;

public class StringRotator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int amount = in.nextInt();
        in.close();
        System.out.println(rotateString_v2(word, amount));
    }

    public static String rotateString(String s, int amount) {
        String z = s + s + s;
        s = z.substring(s.length()-amount%s.length(), s.length()-amount%s.length()+s.length());
        return s;
    }

    public static String rotateString_v2(String s, int amount) {
        String z="";
        for (int i=s.length(); i<2*s.length(); i++) {
            z += s.charAt((i-amount%s.length())%s.length());
        }
        return z;
    }
}