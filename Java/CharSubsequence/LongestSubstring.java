package CharSubsequence;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strA = in.nextLine();
        String strB = in.nextLine();
        String subString;
        in.close();

        subString = longestCommonSubStr(strA, strB);

        System.out.println(subString);

    }

    // public static String longestCommonSubStr (String a, String b) {
    //     String sub = "";
    //     for (int i=0; i<b.length(); i++) {
    //         if (sub.length() >= b.length()-i) break;
    //         for (int j=0; j<=i; j++) {
    //             sub += b.charAt(i+j);
    //             if (!Substring.isSubstrOf(sub, a)) {
    //                 sub = "";
    //                 break;
    //             }
    //         }
    //     }
        
        
    //     return sub;
    // }

    public static String longestCommonSubStr (String a, String b) {

        return "";
    }

    public static String getSub (String str, int len, int from) {
        String sub = "";
        for (int i=from; i<len; i++) 
        return "";
    } 
}
