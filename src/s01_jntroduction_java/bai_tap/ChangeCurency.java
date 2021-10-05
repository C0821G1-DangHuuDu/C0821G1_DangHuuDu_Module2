package s01_jntroduction_java.bai_tap;

import java.util.Scanner;

public class ChangeCurency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rate=23000;
        System.out.println("Nhập vào số tiền USD muốn đổi sang VND:");
        int usd=input.nextInt();
        int vnd=usd*rate;
        System.out.println("Số tiền VND nhận được là: "+vnd);
    }
}
