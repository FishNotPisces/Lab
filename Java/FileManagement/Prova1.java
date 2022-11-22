package Java.FileManagement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Prova1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("newfile.txt");
        Scanner input = new Scanner(reader);
    }
}