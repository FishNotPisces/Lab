package FileManagement.Media;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import DynamicArrays.IntegerArray;

public class MyStatistics {
    public static void main(String[] args) throws IOException {
        FileReader data = new FileReader("FileManagement/Media/Integers.dat");
        Scanner in = new Scanner(data);
        IntegerArray array = new IntegerArray();

        while (in.hasNextInt()) {
            array.append(in.nextInt());
        }

        System.out.println(average(array));
        in.close();
        data.close();

    }

    public static double average (IntegerArray nums) {
        int mean = 0;
        for (int i = 0; i<nums.length(); i++) {
            mean += nums.getElement(i);
        }
        mean /= nums.length();
        return mean;
    }
}
