package s03_method.bai_tap;

public class ConcatArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};
        int[] array3=new int[array1.length+array2.length];
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int j=array3.length-1;j>=array1.length;j--){
            array3[j]=array2[j-array1.length];
        }

        System.out.println("Display new Array: ");
        for (int k = 0; k < array3.length; k++) {
            System.out.print(array3[k] + "\t");
        }
    }
}
