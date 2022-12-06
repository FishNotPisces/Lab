package Tools;
//import Tools.ArrayAlgs;

public class tmp_AlgoTester {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        //arr = ArrayAlgs.linearFill(N);
       
        arr = ArrayAlgs.unicRandomFill(N);

        System.out.println(ArrayAlgs.printValues(arr));


    }
}
