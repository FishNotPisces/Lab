package Tools;

public class ArrayAlgs {
    public static void reverse(int[] array) {
        int _tmp;
        for(int i=0; i<(int)((array.length)/2); i++) {
            _tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = _tmp;
        }
    }

    public static void copy(int[] arrayFrom, int[] arrayTo) {
        if (arrayTo.length < arrayFrom.length) {
            throw new ArithmeticException("Trying to copy values to a smaller array");
        }
        else {
            for (int i=0; i<arrayFrom.length; i++) {
                arrayTo[i] = arrayFrom[i];
            }
        }
    }

    public static int[] resize(int[] array, int newLength) {
        int[] _tmp = new int[array.length];
        copy(array, _tmp);
        array = new int[newLength];
        for (int i=0; i<newLength; i++) {
            array[i] = _tmp[i];
        }
        return array;
    }

    public static int[] linearFill(int length) {
        int[] arr = new int[length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] linearFill(int length, int step) {
        int[] arr = new int[length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i*step;
        }
        return arr;
    }

    public static int[] linearFill(int length, int from, int step) {
        int[] arr = new int[length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i*step + from;
        }
        return arr;
    }

    public static String printValues(int[] array) {
        String str = "";
        for (int i : array) {
            str += array[i] + " ";
        }
        return str;
    }

    public static int[] unicRandomFill(int length) {
        int[] values = new int[length];
        values = linearFill(length);
        int randomIndex;
        int[] rands = new int[length];
        for (int i = 0; i<length; i++) {
            System.out.println(printValues(values));
            randomIndex = (int)(Math.random()*values.length - 1);
            System.out.println("rndInd:: " + randomIndex);
            rands[i] = values[randomIndex];
            System.out.println("rnds_I:: " + rands[i]);
            values[randomIndex] = values[values.length-1];
            System.out.println("lastVal:: " + values[values.length-1]);
            System.out.println("vals_rndInd:: " + values[randomIndex]);
            int size = values.length - 1;
            values = resize(values, size);
            System.out.println("vals_rndInd:: " + values[randomIndex]);
            System.out.println("------ round: " + i + " :------");
        }
        return rands;
    }
}
