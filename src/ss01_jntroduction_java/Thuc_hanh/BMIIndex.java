package ss01_jntroduction_java.Thuc_hanh;

import java.util.Scanner;

public class BMIIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng của bạn (Kilogram): ");
        double weight = input.nextDouble();

        System.out.println("Nhập vào chiều cao của bạn (met): ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            //%-10.2f là gì?
            System.out.printf("BMI = %-10.2f is Underweight", bmi);
        } else if (bmi < 25.0) {
            System.out.printf("BMI = %-10.2f is Normal", bmi);
        } else if (bmi < 30.0) {
            System.out.printf("BMI = %-10.2f is Overweight", bmi);
        } else {
            System.out.printf("BMI = %-10.2f is Obese", bmi);
        }
    }
}
