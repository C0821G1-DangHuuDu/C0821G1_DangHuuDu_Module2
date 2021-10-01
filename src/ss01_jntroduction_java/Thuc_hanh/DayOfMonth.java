package ss01_jntroduction_java.Thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Month to check:");
        int month=input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Month %d has 31 day", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Month %d has 30 day", month);
                break;
            case 2:
                System.out.printf("Month %d has 28 or 29 day", month);
            default:
                System.out.println("Month %d has not found");
        }

    }
}
