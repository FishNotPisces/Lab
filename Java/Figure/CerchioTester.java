package Figure;

import java.util.Scanner;
import java.util.Locale;

public class CerchioTester
{
    public static void main(String[] args)
    {
        // apertura flusso d'ingresso
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
          
        System.out.print("Introdurre O(x1,y1) e r1 su una riga: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double r1 = in.nextDouble();     
        Cerchio c1 = new Cerchio(x1, y1, r1); 

        System.out.print("Introdurre O(x2,y2) e r2 su una riga: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double r2 = in.nextDouble();
        Cerchio c2 = new Cerchio(x2, y2, r2); 

        in.close();
      
        if (c1.isCoincident(c2))
            System.out.println(" coincidono");
        if (c1.isEncircled(c2))
            System.out.println(" sono uno interno all'altro");
        if (c1.isTangential(c2))
            System.out.println(" sono tangenti");
        if (c1.isSecant(c2))          
            System.out.println(" sono secanti");
        if (c1.isExternal(c2))                            
            System.out.println(" sono esterni uno all'altro");
    }
}
