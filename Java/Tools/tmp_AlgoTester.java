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
        System.out.println(Meth.numberOfDigits(Long.parseLong(args[0])));
        System.out.println(Meth.numberOfDigits(Long.MAX_VALUE));

        // // ERROR BETWEEN 999999999999995999(18) AND 999999999999996000(18:output19)
        
        // ACTUAL ERROR BTWN 999999999999995968(18) AND 999999999999995969(18:output19)
    }
}
