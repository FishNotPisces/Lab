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
    //     String subHolder = "";
    //     for (int i=0; i<b.length(); i++) {
    //         if (sub.length() >= b.length()-i) break;
    //         for (int j=i; j<b.length()-i; j++) {
    //             if (!Substring.isSubstrOf(sub, a)) {
    //                 if (sub.length()>subHolder.length()) subHolder = sub;
    //                 sub = "";
    //                 break;
    //             }
    //             sub += b.charAt(i+j);
    //         }
    //         if (sub.length()>subHolder.length()) subHolder = sub;
    //     }
        
        
    //     return subHolder;
    // }

    // public static String longestCommonSubStr (String a, String b) {

    //     return "";
    // }

    // public static String getSub (String str, int len, int from) {
    //     String sub = "";
    //     for (int i=from; i<len; i++) {

    //     }
    //     return "";
    // } 


    /* 
     * 
     * 
     * 
     * 
     *  
     */


    private int[] matrixDiagLengths (int n, int m) {
        
    }

    public static String longestCommonSubStr (String a, String b) {
        int diagMax = b.length();
        int diagNum = a.length() + b.length() - 1;
        if (a.length() < b.length()) {
            String _tmp = b;
            b = a;
            a = _tmp;
            diagMax = a.length();
        }

        boolean[][] checks = new boolean[a.length()][b.length()];
        for (int i=0; i<b.length(); i++) {
            for (int j=0; j<a.length(); j++) {
                if (a.charAt(j) == b.charAt(i)) {
                    checks[j][i] = true;
                }
                else {
                    checks[j][i] = false;
                }
            }
        }
        
        int[] dagLens = new int[diagNum];

        for (int i=0; i<diagNum; i++) {
            for (int j=0; j<0/*actually things*/; j++) {
                
            }
        }
    }
}