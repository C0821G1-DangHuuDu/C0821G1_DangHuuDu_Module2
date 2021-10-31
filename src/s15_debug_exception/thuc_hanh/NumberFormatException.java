package s15_debug_exception.thuc_hanh;

import java.util.Scanner;

public class NumberFormatException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        NumberFormatException calc = new NumberFormatException();
        try {
            calc.calculate(x, y);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    private void calculate(int x, int y) throws NumberFormatException {
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        System.out.println("Tổng x + y = " + a);
        System.out.println("Hiệu x - y = " + b);
        System.out.println("Tích x * y = " + c);
        System.out.println("Thương x / y = " + d);
    }

}
