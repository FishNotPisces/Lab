package DynamicArrays;

public class IntegerArray {
    public IntegerArray() {
        this.len = 20;
        array = new int[len];
        elements = 0;
    }

    public IntegerArray(int len) {
        this.len = len;
        array = new int[len];
        elements = 0;
    }

    public void append(int num) {
        array[elements] = num;
        elements++;
        if (isFull()) {
            int[] _array = array;
            array = new int[len*2];
            for (int i=0; i<len; i++) {
                array[i] = _array[i];
            }
            len *= 2;
        }
    }

    public int length() {
        return this.elements;
    }

    public String toString() {
        String elements = "";
        for (int i=0; i<this.elements; i++) {
            elements += this.array[i] + " ";
        }
        return elements;
    }

    public int getElement(int num) {
        return array[num];
    }

    private boolean isFull() {
        boolean isFull = false;
        if (elements == len-1) {
            isFull = true;
        }
        return isFull;
    }

    private int len;
    private int elements;
    private int[] array;
}
