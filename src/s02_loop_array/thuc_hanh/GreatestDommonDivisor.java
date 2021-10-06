package s02_loop_array.thuc_hanh;

import java.util.Scanner;

public class GreatestDommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = Integer.parseInt(input.nextLine());

        System.out.print("Enter b: ");
        b = Integer.parseInt(input.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest common divisor: " + a);
        }

    }
}
