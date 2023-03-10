package Sorts;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {6, 5, 9, 3, 7, 2, 8};
        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void InsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            for (int j = i-1; j >= 0; j--) {
                if (tmp < a[j]) {
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
                else {
                    break;
                }
            }
        }
    }
}
