package CharSubsequence;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String z = in.nextLine();
        in.close();

        boolean isSub = isSubstrOf(z, s);
        System.out.println(isSub);
    }

    public static boolean isSubstrOf(String sub, String str) {
        boolean isSub = false;
        if (sub.equals("")) return true;
        for(int i=0; i<str.length()-sub.length(); i++) {
            isSub = true;
            for(int j=0; j<sub.length(); j++) {
                if (str.charAt(i+j) != sub.charAt(j)) {
                    isSub = false;
                    break;
                }
            }
            if (isSub) break;
        }
        return isSub;
    }
}
