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
        int[] newArray = new int[newLength];
        for (int i=0; i<newLength; i++) {
            newArray[i] = _tmp[i];
        }
        return newArray;
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

    public static int[] linearFill(int length,  int step, int from) {
        int[] arr = new int[length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i*step + from;
        }
        return arr;
    }

    public static String printValues(int[] array) {
        String str = "";
        for (int i = 0; i<array.length; i++) {
            str += array[i] + " ";
        }
        return str;
    }

    public static String printValues(String[] array) {
        String str = "";
        for (int i = 0; i<array.length; i++) {
            str += array[i] + " ";
        }
        return str;
    }

    public static int[] unicRandomFill(int length) {
        int[] values = linearFill(length);
        int[] rands = new int[length];
        int randomIndex; 
        for (int i = 0; i<length; i++) {
            randomIndex = (int)(Math.random()*(length-i));
            rands[i] = values[randomIndex];
            values[randomIndex] = values[length-i-1];
        }
        return rands;
    }

    public static int[] unicRandomFill(int length, int from) {
        int[] values = linearFill(length, 1, from);
        int[] rands = new int[length];
        int randomIndex; 
        for (int i = 0; i<length; i++) {
            randomIndex = (int)(Math.random()*(length-i));
            rands[i] = values[randomIndex];
            values[randomIndex] = values[length-i-1];
        }
        return rands;
    }
}
