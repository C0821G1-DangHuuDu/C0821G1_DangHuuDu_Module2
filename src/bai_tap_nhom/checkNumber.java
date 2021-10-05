package bai_tap_nhom;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("input number: ");
            n = Integer.parseInt(input.nextLine());
        } while (n < 1 || n > 100);
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n < 5) {
                System.out.println("Not Weird");
            } else if (n < 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

    }

}
