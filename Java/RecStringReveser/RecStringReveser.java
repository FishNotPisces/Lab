package RecStringReveser;

public class RecStringReveser {
    public static void main(String[] args) {
        System.out.println(reverseString(args[0]));
    }

    public static String reverseString (String s) {
        String rev = "";
        if (s.length() == 1) return s;
        rev = reverseString(s.substring(1)) + s.charAt(0) + rev;
        return rev;
    }
}
