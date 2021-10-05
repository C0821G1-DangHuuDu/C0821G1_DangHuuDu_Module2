package s03_method.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static double fahrenheitToCelsius(double temF) {
        double temC = (temF - 32) * (5.0 / 9);
        return temC;
    }

    public static double celsiusToFahrenheit(double temC) {
        double temF = temC * (9.0 / 5) + 32;
        return temF;
    }

    public static void main(String[] args) {
        ConvertTemperature convertTemperature = new ConvertTemperature();
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: \n 1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit \n 0.Exit ");
        System.out.print("Enter your choose: ");
        int choose = Integer.parseInt(input.nextLine());
        double temperatureF;
        double temperatureC;
        if (choose == 1) {
            System.out.print("Enter Fahrenheit to convert Celsius: ");
            temperatureF = Double.parseDouble(input.nextLine());
            temperatureC = fahrenheitToCelsius(temperatureF);
            System.out.println("Celsius is: " + temperatureC);
        } else if (choose == 2) {
            System.out.print("Enter Celsius to convert Fahrenheit: ");
            temperatureC = Double.parseDouble(input.nextLine());
            temperatureF = celsiusToFahrenheit(temperatureC);
            System.out.println("Fahrenheit is: " + temperatureF);
        } else {
            System.out.println("Exit");
        }
    }
}
