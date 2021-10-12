package bai_tap_nhom.tuan_2;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int n;
        int q;
        int count = 1;
        do {
            System.out.print("Nhập số q: ");
            q = Integer.parseInt(input.nextLine());
        } while (q < 0 || q > 500);
        while (count <= q) {
            do {
                System.out.print("Nhập số a: ");
                a = Integer.parseInt(input.nextLine());
                System.out.print("Nhập số b: ");
                b = Integer.parseInt(input.nextLine());
            } while (a < 0 || b < 0 || b > 50 || a > 50);
            do {
                System.out.print("Nhập số n: ");
                n = Integer.parseInt(input.nextLine());
            } while (n < 1 || n > 15);
            int sum = a;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    sum += Math.pow(2, j)*b ;
                }
                System.out.print(sum + "\t");
                sum = a;

            }
            count += 1;
            System.out.print("\n");
        }
    }

}
