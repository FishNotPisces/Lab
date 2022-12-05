package Tools;

public class ArrayAlgs {
    public static void reverse(int[] array) {
        int _temp;
        for(int i=0; i<(int)((array.length)/2); i++) {
            _temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = _temp;
        }
    }

    public static void copy(int[] arrayFrom, int[] arrayTo) {
        if (arrayTo.length < arrayFrom.length) {
            throw new ArithmeticException("Trying to copy values to a smaller array");
        }
        else {
            for (int i : arrayFrom) {
                arrayTo[i] = arrayFrom[i];
            }
        }
    }

    public static int[] linearFill(int length) {
        int[] arr = new int[length];
        for(int i : arr) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] linearFill(int length, int step) {
        int[] arr = new int[length];
        for(int i : arr) {
            arr[i] = i*step;
        }
        return arr;
    }

    public static int[] linearFill(int length, int from, int step) {
        int[] arr = new int[length];
        for(int i : arr) {
            arr[i] = i*step + from;
        }
        return arr;
    }

    public static String printValues(int[] array) {
        String str = "";
        for (int i : array) {
            str += array[i];
        }
        return str;
    }
}
