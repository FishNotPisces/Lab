import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Prova1 {
    public static void main(String[] args) throws IOException {
        Scanner getIn = new Scanner(System.in);
        String filename = getIn.nextLine();
        FileReader reader = new FileReader(filename);
        Scanner input = new Scanner(reader);
        String line;
        while(input.hasNextLine()) {
            line = input.nextLine();
            System.out.println(line);
        }
        input.close();
        reader.close();
    }
}