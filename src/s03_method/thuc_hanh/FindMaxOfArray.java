package s03_method.thuc_hanh;

import java.util.Scanner;

public class FindMaxOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input size (size<=20): ");
            size = Integer.parseInt(input.nextLine());
        } while (size < 1 || size > 20);
        int[] arrayOfProperty = new int[size];
        int max = arrayOfProperty[0];
        int index = 0;

        for (int i = 0; i < arrayOfProperty.length; i++) {
            System.out.print("Input element at " + (i + 1) + ": ");
            arrayOfProperty[i] = Integer.parseInt(input.nextLine());
            if (arrayOfProperty[i] >= max) {
                max = arrayOfProperty[i];
                index = i + 1;
            }
        }

        System.out.println("Display Property list: ");
        for (int j = 0; j < arrayOfProperty.length; j++) {
            System.out.print(arrayOfProperty[j] + "\t");
        }
        System.out.print("\n");
        System.out.println("The largest of Property list is: " + max + " ,at position: " + index);


    }
}
