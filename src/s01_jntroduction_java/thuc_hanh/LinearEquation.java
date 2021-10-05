package s01_jntroduction_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất có dạng ax+b=c.");
        Scanner input=new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a=Integer.parseInt(input.nextLine());

        System.out.println("Nhập số b: ");
        int b=Integer.parseInt(input.nextLine());

        System.out.println("Nhập số c: ");
        int c=Integer.parseInt(input.nextLine());

        if(a!=0){
            double x=(c-b)/a;
            System.out.println("Nghiệm của phương trình là: x = " + x );
        } else {
            if (b == c) {
                System.out.print("Phương trình vố số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }
}
