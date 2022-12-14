package RecStringReveser;

public class RecPalindromeCheck {
    public static void main(String[] args) {
        String sentence = "";
        try {
            sentence += args[0];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            sentence = "";
        }
        finally {
            System.out.println(advancedPalCheck(sentence));
        }
    }

    public static boolean simplePalCheck (String str) {
        if (str.length() == 0) return true;
        return str.equals(RecStringReveser.reverseString(str));
    }

    public static boolean advancedPalCheck (String s) {
        if (s.length() == 0) return true;
        String str = recNoSymbol(s.trim().toLowerCase());
        return str.equals(RecStringReveser.reverseString(str));
    }

    public static String recNoSymbol (String s) {
        String rev = "";
        if (s.length() == 1 && s.toLowerCase().charAt(0) >= 97 && s.toLowerCase().charAt(0) <= 122) return s;
        else if (s.length() == 1) return "";
        if (s.toLowerCase().charAt(0) >= 97 && s.toLowerCase().charAt(0) <= 122) {
            rev = rev + s.charAt(0) + recNoSymbol(s.substring(1));
        }
        else {
            rev = rev + recNoSymbol(s.substring(1));
        }
        return rev;
    }
}
