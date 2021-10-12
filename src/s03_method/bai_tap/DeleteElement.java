package s03_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int size;
//        do {
//            System.out.print("Input size (size<=20): ");
//            size = Integer.parseInt(input.nextLine());
//        } while (size < 1 || size > 20);
//        int[] arrayOfNumber = new int[size];
        int[] arrayOfNumber = {4, 12, 7, 8, 1, 6, 9};
        boolean check = false;
        System.out.print("Nhập vào số cần xoá: ");
        int num = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrayOfNumber.length; i++) {
            if (arrayOfNumber[i] == num) {
                check = true;
                for (int j = i; j < arrayOfNumber.length - 1; j++) {
                    arrayOfNumber[j] = arrayOfNumber[j + 1];
                }
                arrayOfNumber[arrayOfNumber.length - 1] = 0;
                break;
            } else {
                check = false;
            }

        }
        if (check == false) {
            System.out.println("Not found Number " + num + " in Array.");
        } else {
            System.out.println("Display new Array: ");
            for (int j = 0; j < arrayOfNumber.length; j++) {
                System.out.print(arrayOfNumber[j] + "\t");
            }
        }
    }
}
