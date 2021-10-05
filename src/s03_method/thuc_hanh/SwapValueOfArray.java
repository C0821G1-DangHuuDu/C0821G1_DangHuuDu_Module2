package s03_method.thuc_hanh;

import java.util.Scanner;

public class SwapValueOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SwapValueOfArray swap = new SwapValueOfArray();
        int size;

        do {
            System.out.println("Nhập vào độ dài của mảng (<=20): ");
            size = Integer.parseInt(input.nextLine());
        } while (size <= 0 || size > 20);
        int[] arrayNumber = new int[size];
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Nhập vào giá trị thứ " + (i + 1) + " của mảng");
            arrayNumber[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Các phần tử trong mảng vừa nhập:");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);
        }
/* Cách 1: không dùng phương thức*/
//        for (int i = 0; i < arrayNumber.length/2; i++) {
//            int temp = arrayNumber[i];
//            arrayNumber[i] = arrayNumber[arrayNumber.length - (i + 1)];
//            arrayNumber[arrayNumber.length - (i + 1)] = temp;
//        }
        /* Cách 2: dùng phương thức*/
        swap.swapArray(arrayNumber);

        System.out.println("Các phần tử trong mảng sau khi đảo mảng:");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);
        }
    }
    public void swapArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
    }
}

