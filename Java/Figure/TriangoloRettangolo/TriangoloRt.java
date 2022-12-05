package Figure.TriangoloRettangolo;

import java.util.Scanner;

public class TriangoloRt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cateto_1 = in.nextDouble();
        double cateto_2 = in.nextDouble();
        in.close();

        double ipotenusa, perimetro, area, angolo_1, angolo_2;
        ipotenusa = Math.sqrt(cateto_1*cateto_1 + cateto_2*cateto_2);
        perimetro = cateto_1 + cateto_2 + ipotenusa;
        area = cateto_1*cateto_2 / 2;
        angolo_1 = Math.acos(cateto_1/ipotenusa)*180/Math.PI;
        angolo_2 = Math.acos(cateto_2/ipotenusa)*180/Math.PI;

        System.out.printf("Ipotenusa: %8.2f cm%n", ipotenusa);
        System.out.printf("Perimetro: %8.2f cm%n", perimetro);
        System.out.printf("Area:      %8.2f cm2%n", area);
        System.out.printf("Angolo 1:  %8.2f°%n", angolo_1);
        System.out.printf("Angolo 2:  %8.2f°%n", angolo_2);
    }
}
