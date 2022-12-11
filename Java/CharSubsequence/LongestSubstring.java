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


    private static int[] matrixDiagLengths (int n, int m) {
        int[] arr = new int[n+m-1];
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        for (int i=1; i<min; i++) {
            arr[i-1] = i;
        }
        for (int i = min; i<max+1; i++) {
            arr[i-1] = min;
        }
        for (int i = n+m-1; i>=max+1; i--) {
            arr[i-1] = n+m-i;
        }

        return arr;
    }

    public static String longestCommonSubStr (String a, String b) {
        int diagMax = b.length();
        int diagNum = a.length() + b.length() - 1;
        boolean[][] checks = new boolean[a.length()][b.length()];
        if (a.length() < b.length()) {
            String _tmp = b;
            b = a;
            a = _tmp;
            diagMax = a.length();
        }
        
        for (int i=0; i<b.length(); i++) {
            for (int j=0; j<a.length(); j++) {
                if (a.charAt(j) == b.charAt(i)) {
                    checks[j][b.length()-i-1] = true;
                }
                else {
                    checks[j][b.length()-i-1] = false;
                }
            }
        }
        
        int[] diagLens = matrixDiagLengths(a.length(), b.length());
        // for (int i=0; i<diagNum; i++) {
        //     System.out.println(diagLens[i]);
        // }

        // for (int i=0; i<b.length(); i++) {
        //     for (int j=0; j<a.length(); j++) {
        //         System.out.print(checks[j][i] + " ");
        //     }
        //     System.out.println("");
        // }

        // for (int i=0; i<diagNum; i++) {
        //     for (int j=0; j<diagLens[i]; j++) {
        //         //System.out.print(checks[j][i] + " ");
        //         System.out.print(j+"-"+i+" ");
        //     }
        //     System.out.println("");
        // }

        for( int k = 0 ; k <= a.length() + b.length() - 2; k++ ) {
            for( int j = 0 ; j <= k ; j++ ) {
                int i = k - j;
                if( i < a.length() && j < b.length() ) {
                    System.out.print( checks[i][j] + " " );
                }
            }
            System.out.println();
        }

        return "fatto";
    }
}
