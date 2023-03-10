package Sorts;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {6, 5, 9, 3, 7, 2, 8};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void SelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            int tmp = a[i];
            for (int j = i+1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            a[i] = a[min];
            a[min] = tmp;
        }
    }
}
