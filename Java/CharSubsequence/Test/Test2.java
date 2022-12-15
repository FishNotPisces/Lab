package CharSubsequence.Test;

import Tools.ArrayAlgs;

public class Test2 {
    public static void main(String[] args) {
        int rows = 5;
        int length = 10;
        String[] words = new String[rows];
        for (int i=0; i<rows; i++) {
            words[i] = ArrayAlgs.stringValues(ArrayAlgs.charsRandomFill(length)) + "_";
        }

        for (int i=0; i<rows; i++) {
            System.out.println(words[i]);
        }
        System.out.println();
        for (int i=0; i<rows; i++) {
            words[i] = traslateString(words[i], i);
        }

        for (int i=0; i<rows; i++) {
            System.out.println(words[i]);
        }

    }

    public static String traslateString (String s, int amount) {
        String z = "";
        z += s + s;
        s = z.substring(amount, amount+s.length());
        return s;
    }
}
