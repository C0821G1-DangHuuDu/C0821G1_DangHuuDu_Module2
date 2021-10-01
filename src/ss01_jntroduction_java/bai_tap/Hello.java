package ss01_jntroduction_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name=input.nextLine();
        System.out.println("Hello" + name);
    }
}
