package DynamicArrays;

public class DoubleArray {
    public DoubleArray() {
        this.len = 20;
        array = new double[len];
        elements = 0;
    }

    public DoubleArray(int len) {
        this.len = len;
        array = new double[len];
        elements = 0;
    }

    public void append(double num) {
        array[elements] = num;
        elements++;
        if (isFull()) {
            double[] _array = array;
            array = new double[len*2];
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

    public double getElement(int num) {
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
    private double[] array;
}
