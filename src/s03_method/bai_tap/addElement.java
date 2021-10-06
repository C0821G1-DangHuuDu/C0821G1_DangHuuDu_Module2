package s03_method.bai_tap;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayOfNumber = new int[10];
        arrayOfNumber[0] = 4;
        arrayOfNumber[1] = 12;
        arrayOfNumber[2] = 7;
        arrayOfNumber[3] = 8;
        arrayOfNumber[4] = 1;
        arrayOfNumber[5] = 6;

        System.out.println("Display Array: ");
        for (int j = 0; j < arrayOfNumber.length; j++) {
            System.out.print(arrayOfNumber[j] + "\t");
        }

        System.out.print("\n");
        System.out.print("Nhập vào số cần thêm: ");
        int num = Integer.parseInt(input.nextLine());
        System.out.print("\n");

        System.out.print("Nhập vào vị trí cần thêm: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("\n");

        for (int i = arrayOfNumber.length - 1; i > index; i--) {
            arrayOfNumber[i] = arrayOfNumber[i - 1];
        }
        arrayOfNumber[index] = num;

        System.out.print("\n");
        System.out.println("Display new Array: ");
        for (int j = 0; j < arrayOfNumber.length; j++) {
            System.out.print(arrayOfNumber[j] + "\t");
        }
    }
}

