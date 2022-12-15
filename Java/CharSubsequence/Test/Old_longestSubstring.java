package CharSubsequence.Test;

import java.util.Scanner;

import CharSubsequence.Substring;

//  !!!!!!!!
//       THIS CODE IS NOT WORKING  
//  !!!!!!!!
//       working version : LongestSubstring.java

public class Old_longestSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strA = in.nextLine();
        String strB = in.nextLine();
        String subString;
        in.close();

        subString = longestCommonSubStr(strA, strB);
        System.out.println(subString);
        // System.out.println(lcsSlow(strA, strB));
    }

    public static String longestCommonSubStr (String a, String b) {
        int diagNum = a.length() + b.length() - 1;
        if (a.length() < b.length()) {
            String _tmp = b;
            b = a;
            a = _tmp;
        }
        boolean[][] checks = new boolean[a.length()][b.length()];
        String[] subs = new String[diagNum];
        int grater = 0;

        // Setup to make sure a is longer than b
        
        // Create a matrix of common chars between the two strings
        // the longer consecutive set of "true" read diagonally will be the longer common substring
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
        
        // runs through the checks array and add the common substrings to an array of strings
        // also keeps track of the index of the longest substring
        for( int k = 0 ; k <= a.length() + b.length() - 2; k++ ) {
            subs[k] = "";
            for( int j = 0 ; j <= k ; j++ ) {
                int i = k - j;
                if( i < a.length() && j < b.length() ) {
                    if (checks[i][j]) {
                        subs[k] += a.charAt(i);
                    }
                }
            }
            if (subs[k].length() > subs[grater].length()) {
                grater = k;
            }
        }
        return Tools.StringAlgs.reverse(subs[grater]);
    }


    public static String lcsSlow (String a, String b) {
        String substr = "";
        boolean isSub = false;
        for (int i = 0; i<a.length(); i++) {
            for (int j = 0; j<=i; j++) {
                substr = Tools.StringAlgs.substring(b, j, b.length()-i);
                if (Substring.isSubstrOf(substr, a)) {
                    isSub = true;
                    break;
                }
            }
            if (isSub) break;
        }
        return substr;
    }
}

// bsrbsrbs
// bsfbs
