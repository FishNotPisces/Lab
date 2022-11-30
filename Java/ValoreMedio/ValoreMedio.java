package ValoreMedio;

import java.util.Scanner;

import DynamicArrays.DoubleArray;

public class ValoreMedio {
    public static void main(String[] args) {
        double valoreMedio;
        double deviazioneStd;
        DoubleArray valori = new DoubleArray();
        Scanner in = new Scanner(System.in);

        String next = in.nextLine();
        while (!next.equals("end")) {
            valori.append(Double.parseDouble(next));
            next = in.nextLine();
        }
        in.close();

        if (valori.length() == 0) {
            valoreMedio = 0;
            deviazioneStd = 0;
        }
        else if (valori.length() == 1) {
            valoreMedio = valori.getElement(0);
            deviazioneStd = 0;
        }
        else {
            valoreMedio = sommaDi(valori)/valori.length();
            deviazioneStd = devStd(valori);
        }

        System.out.println("valore medio: " + valoreMedio);
        System.out.println("deviazione standard: " + deviazioneStd);
    }

    public static double sommaDi(DoubleArray a) {
        double som = 0.0d;
        for (int i=0; i<a.length(); i++) {
            som += a.getElement(i);
        }
        return som;
    }

    public static double sommaGeometricaDi(DoubleArray a) {
        double geo = 0.0d;
        for (int i=0; i<a.length(); i++) {
            geo += a.getElement(i) * a.getElement(i);
        }
        return geo;
    }

    public static double devStd(DoubleArray a) {
        double somma = sommaDi(a);
        double sommaGeo = sommaGeometricaDi(a);

        return Math.sqrt((sommaGeo - somma*somma/a.length()) / (a.length()-1));
    }
}