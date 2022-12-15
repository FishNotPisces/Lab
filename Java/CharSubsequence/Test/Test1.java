package CharSubsequence.Test;

import Tools.ArrayAlgs;

public class Test1 {
    public static void main(String[] args) {
        int X = 5;
        int Y = 7;
        char[][] car = ArrayAlgs.charsRandomFill(X, Y);

        for (int i=0; i<Y; i++) {
            for (int j=0; j<X; j++) {
                System.out.print(car[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        car = orizScrollAlign(car, X, Y);

        for (int i=0; i<Y; i++) {
            for (int j=0; j<X; j++) {
                System.out.print(car[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static char[][] orizScrollAlign (char[][] ch, int x, int y) {
        char tmp;
        int from = 0;
        for (int i=0; i<y; i++) {
            tmp = ch[i][from];
            int j = from+1;
            while (j != from) {
                j++;
                if (j >= x) j = 0;
                System.out.println(j + " " + from);
                
                if (j == from-1) {
                    ch[i][j+1] = tmp;
                }
                else if (j != x-1) {
                    ch[i][j+1] = ch[i][j]; 
                }
                else {
                    ch[i][0] = ch[i][j];
                }

            }
            from++;
            if (from >= x) from = 0;
        }
        return ch;
    }
}
