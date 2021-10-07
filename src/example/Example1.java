package example;

public class Example1 {
    int count = 0;
    /*se lay bo nho (memory) khi bien instance duoc tao*/

    /*Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong*/
    Example1() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Example1 c1 = new Example1();
        Example1 c2 = new Example1();
        Example1 c3 = new Example1();
    }
}

