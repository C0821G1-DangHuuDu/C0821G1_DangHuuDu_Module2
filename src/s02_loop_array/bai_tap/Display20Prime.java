package s02_loop_array.bai_tap;

import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter your size (<=20): ");
            size = Integer.parseInt(input.nextLine());

        } while (size < 1 || size > 20);
        int count = 0;
        int number;
        for (number = 2; count < size; number++) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.print(number + "\t");
                count += 1;
            }


        }
    }
}
