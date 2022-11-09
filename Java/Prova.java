import java.util.Scanner;

public class Prova {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.println("Ciao! Come ti chiami?\n");
        
        name = input.nextLine();
        
        System.out.println("\n\nPiacere di conoscerti " + name);
    }
}
