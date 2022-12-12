package Tools;

public class StringAlgs {
    public static String reverse (String s) {
        String r = "";
        for (int i=s.length()-1; i>=0; i--) {
            r += s.charAt(i);
        }

        return r;
    }

    public static String substring (String s, int from, int length) {
        String sub = "";
        for (int i = 0; i<length; i++) {
            sub += s.charAt(i+from);
        }
        return sub;
    }
}
