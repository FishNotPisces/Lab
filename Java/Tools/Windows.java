package Tools;

public class Windows {
    public static void consoleClear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
