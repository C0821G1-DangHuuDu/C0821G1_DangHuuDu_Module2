package s03_method.bai_tap;

import java.util.Scanner;

public class findMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input size: ");
            size = Integer.parseInt(input.nextLine());
        } while (size < 1 || size > 20);
        int[] arrayOfNumber = new int[size];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.print("Input element at " + (i + 1) + ": ");
            arrayOfNumber[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Display Array: ");
        for (int j = 0; j < arrayOfNumber.length; j++) {
            System.out.print(arrayOfNumber[j] + "\t");
        }
        int index = 0;
        int min = arrayOfNumber[index];
        for(int i=1;i<arrayOfNumber.length;i++) {
            if (arrayOfNumber[i] <= min) {
                min = arrayOfNumber[i];
                index = i + 1;
            }
        }
        System.out.print("\n");
        System.out.println("The smallest of Array is: " + min + " ,at position: " + index);
    }
}
