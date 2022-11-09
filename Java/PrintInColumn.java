import java.util.Scanner;

public class PrintInColumn {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        words = words + " ";
        String wrd = "";
        
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                System.out.println(wrd);
                wrd = "";
                continue;
            }
            wrd = wrd + words.charAt(i);
        }
    }
}
