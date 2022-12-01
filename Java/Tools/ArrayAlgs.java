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
            for (int i=0; i<arrayFrom.length; i++) {
                arrayTo[i] = arrayFrom[i];
            }
        }
    }

    public static int[] linearFill(int len) {
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static String printValues(int[] array) {
        String str = "";
        for (int i=0; i<array.length; i++) {
            str += array[i];
        }
        return str;
    }
}
