import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter file = new FileWriter("newfile2.txt");
        String line = in.nextLine();
        file.write(line);
        file.close();
    }
}
