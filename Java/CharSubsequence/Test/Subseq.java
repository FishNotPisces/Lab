package CharSubsequence.Test;


import Tools.ArrayAlgs;

public class Subseq {
    public static void main(String[] args) {
        
        String a = "cioccollato";
        String b = "cipolla";
        String[] words = checkChars(a, b, ':');
        // checkChars(a, b, words, ':');

        printValues(words);
    }

    public static String[] checkChars (String a, String b, char spaceSymbol) {
        String[] words = new String[b.length()];
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
            words[i] = CharSubsequence.LongestSubstring.traslateString(words[i], i);
        }
        return words;
    }

    public static void printValues(String[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
