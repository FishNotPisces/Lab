import java.util.Scanner;

public class Adjectives {
    public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    
    String _adj = input.nextLine();
    
    char ending = _adj.charAt(_adj.length()-1);
    
    String adj = _adj.substring(0, _adj.length()-1);
    
    String suffix_dim = "in";
    String suffix_sup = "issim";
    
    System.out.println(_adj);
    System.out.println(adj + suffix_dim + ending);
    System.out.println(adj + suffix_sup + ending);
    
    input.close();
    }

}
