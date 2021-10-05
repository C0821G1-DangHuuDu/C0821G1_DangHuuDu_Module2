package s03_method.thuc_hanh;

import java.util.Scanner;

public class FindMinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int size;
//        do {
//            System.out.print("Input size (size<=20): ");
//            size = Integer.parseInt(input.nextLine());
//        } while (size < 1 || size > 20);
        int[] arrayOfNumber = {4, 12, 7, 8, 1, 6, 9};

        System.out.println("Display Array of Number: ");
        for (int j = 0; j < arrayOfNumber.length; j++) {
            System.out.print(arrayOfNumber[j] + "\t");
        }
        int index= findMinOfArray(arrayOfNumber);
        System.out.print("\n");
        System.out.println("The smallest of Array is: " + arrayOfNumber[index] + " ,at position: " + (index+1));


    }
    public static int findMinOfArray(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=arr[index]){
                index=i;
            }
        }
        return index;
    }
}
