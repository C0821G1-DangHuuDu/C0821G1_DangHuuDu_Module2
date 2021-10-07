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
        Example2 c1 = new Example2();
        Example2 c2 = new Example2();
        Example2 c3 = new Example2();
    }
}
