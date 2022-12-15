package CharSubsequence;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        
        System.out.println(longestCommonSubstring(a, b));
    }
    
    public static String longestCommonSubstring (String a, String b) {
        final char spaceSymbol = ' ';
        String[] words = new String[b.length()];
        checkChars(a, b, words, spaceSymbol);

        String sub = "";
        String tmp = "";
        for (int i=0; i<a.length()+1; i++) {
            for (int j=0; j<b.length(); j++) {
                if (words[j].charAt(i) != spaceSymbol) {
                    tmp += words[j].charAt(i);
                }
                else {
                    if (tmp.length() > sub.length()) {
                        sub = "" + tmp;
                    }
                    tmp = "";
                }
            }
            if (tmp.length() > sub.length()) {
                sub = "" + tmp;
            }
            tmp = "";
        }
        return sub;
    }

    public static void checkChars (String a, String b, String[] words, char spaceSymbol) {
        for (int i=0; i<b.length(); i++) {
            words[i] = "";
            for (int j=0; j<a.length(); j++) {
                if (a.charAt(j) == b.charAt(i)) {
                    words[i] += a.charAt(j);
                }
                else {
                    words[i] += spaceSymbol;
                }
            }
            words[i] += spaceSymbol;
            words[i] = traslateString(words[i], i);
        }
    }

    public static String traslateString (String s, int amount) {
        String z = "";
        z += s + s;
        s = z.substring(amount%s.length(), amount%s.length()+s.length());
        return s;
    }
}