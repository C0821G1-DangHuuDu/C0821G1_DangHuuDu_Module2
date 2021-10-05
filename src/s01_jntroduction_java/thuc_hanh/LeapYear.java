package s01_jntroduction_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input year to check:");
        int year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("Year %d is a Leap year", year);
                } else {
                    System.out.printf("Year %d is Not a Leap year", year);
                }
            } else {
                System.out.printf("Year %d is a Leap year", year);
            }
        } else {

            {
                System.out.printf("Year %d is Not a Leap year", year);
            }
        }
    }
}
