package CharSubsequence.Test;

import java.util.Scanner;

public class InToPostfixNotation {
    public static void main(String[] args) {
        //tester function

        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        in.close();


    }

    public static void toPostfix (String exp) {
        String toPost = "";
        String signBuffer = "";

        for (char c : exp.toCharArray()) {
            
        }
    }
    
    private static boolean isOperation (char c) {
        final char[] lookup = {'+', '-', '*', '/', '^', '%'};
        for (char l : lookup)
            if (l == c) return true;
        return false;
    }
}
