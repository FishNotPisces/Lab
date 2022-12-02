package Tools;
//import Tools.ArrayAlgs;

public class tmp_AlgoTester {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr_1 = new int[13];

        arr = ArrayAlgs.linearFill(10);
        ArrayAlgs.copy(arr, arr_1);
        ArrayAlgs.reverse(arr);

        System.out.println(ArrayAlgs.printValues(arr));
        System.out.println(ArrayAlgs.printValues(arr_1));
    }
}
