package example;

public class Example2 {
    static int count = 0;

    /*se lay bo nho chi mot lan và giu lai gia tri cua no */
    /*ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3 */
    Example2() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        char[] array = new char[1];
        System.out.println(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int ar:array){
            System.out.println(ar);
        }
    }
}
