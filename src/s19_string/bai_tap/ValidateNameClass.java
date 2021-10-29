package s19_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Nhập tên lớp: ");
            String nameClass= input.nextLine();
            while (!Pattern.matches("^[CAP][0-9]{4}[GHIKLM]$",nameClass)){
                System.out.println("Bạn đã nhập sai định dạng.");
                System.out.print("Nhập lại tên lớp: ");
                nameClass= input.nextLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
