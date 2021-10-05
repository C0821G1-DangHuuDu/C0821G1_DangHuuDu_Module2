package s01_jntroduction_java.thuc_hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner input=new Scanner(System.in);

        System.out.println("Nhập chiều rộng:");
        width=input.nextInt();

        System.out.println("Nhập chiều cao:");
        height=input.nextInt();

        int area=width*height;
        System.out.println("Diện tích là: " + area);
    }
}
