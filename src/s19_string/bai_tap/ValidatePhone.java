package s19_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter your Phone: ");
            String phone = input.nextLine();
            while (!Pattern.matches("^\\([0-9]{2}\\)(-)\\((0)[0-9]{9}\\)$", phone)) {
                System.out.println("Your phone not right.");
                System.out.print("Enter your Phone again: ");
                phone = input.nextLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
