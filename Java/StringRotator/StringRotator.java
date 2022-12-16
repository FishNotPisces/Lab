package StringRotator;

import java.util.Scanner;

public class StringRotator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int amount = in.nextInt();
        in.close();
        System.out.println(rotateString(word, amount));
    }

    public static String rotateString(String s, int amount) {
        String z = s + s + s;
        s = z.substring(s.length()-amount%s.length(), s.length()-amount%s.length()+s.length());
        return s;
    }
}