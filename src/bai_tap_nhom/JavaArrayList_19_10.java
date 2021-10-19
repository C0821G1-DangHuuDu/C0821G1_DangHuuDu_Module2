package bai_tap_nhom;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList_19_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList> integerList = new ArrayList<>();

        int n;
        int d;
        int q;
        do {
            System.out.print("input number: ");
            n = Integer.parseInt(input.nextLine());
        } while (n < 1 || n > 20000);
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("input number elemnt: ");
                d = Integer.parseInt(input.nextLine());
            } while (n < 0 || n > 50000);
            ArrayList<Integer> integers = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                System.out.print("input element " + (j + 1) + ": ");
                integers.add((Integer.parseInt(input.nextLine())));
                System.out.print("\n");
            }
            integerList.add(integers);
        }
        do {
            System.out.print("input number: ");
            q = Integer.parseInt(input.nextLine());
        } while (q < 1 || q > 1000);
        for (int i = 0; i < q; i++) {
//            int x;
//            do {
//                System.out.print("input x: ");
//                x = Integer.parseInt(input.nextLine()) - 1;
//            } while (x < 1 || x > n);


            System.out.print("input x: ");
            int x = Integer.parseInt(input.nextLine()) - 1;
            System.out.print("\n");
            System.out.print("input y: ");
            int y = Integer.parseInt(input.nextLine()) - 1;
            if (x<integerList.size()&&y < integerList.get(x).size()) {
                System.out.println(integerList.get(x).get(y));
            } else {
                System.out.println("ERROR");
            }
        }

    }
}
