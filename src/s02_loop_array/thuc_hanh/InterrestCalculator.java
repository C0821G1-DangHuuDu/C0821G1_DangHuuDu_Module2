package s02_loop_array.thuc_hanh;

import java.util.Scanner;

public class InterrestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input =new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        money = Double.parseDouble(input.nextLine());
        System.out.print("\n");

        System.out.print("Enter number of months: ");
        month = Integer.parseInt(input.nextLine());
        System.out.print("\n");

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(input.nextLine());
        System.out.print("\n");

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
