package CharSubsequence;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String z = in.nextLine();
        in.close();

        boolean isSub = isSubseqOf(z, s);
        System.out.println(isSub);
    }

    public static boolean isSubseqOf(String sub, String str) {
        int nextPos = 0;
        boolean match = false;
        for(int i=0; i<sub.length(); i++) {
            match = false;
            for (int j=nextPos; j<str.length(); j++) {
                if(sub.charAt(i) == str.charAt(j)) {
                    match = true;
                    nextPos = j;
                    break;
                }
            }

            if (!match) {
                break;
            }  
        }

        
        return match;
    }
}
