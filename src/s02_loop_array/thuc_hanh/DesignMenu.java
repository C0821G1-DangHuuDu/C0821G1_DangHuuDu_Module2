package s02_loop_array.thuc_hanh;

import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input= new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");

        do {
            System.out.print("Enter your choice (from 0 to 3): ");
            choice = Integer.parseInt(input.nextLine());

        } while (choice<0||choice>3);

        if(choice==1){
            System.out.println("Draw the triangle");
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        }else if (choice==2){
            System.out.println("Draw the square");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
        } else if (choice==3){
            System.out.println("Draw the rectangle");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
        }else {
            System.exit(0);
        }

    }
}
