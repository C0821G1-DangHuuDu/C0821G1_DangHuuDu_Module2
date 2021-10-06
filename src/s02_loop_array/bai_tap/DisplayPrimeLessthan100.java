package s02_loop_array.bai_tap;

public class DisplayPrimeLessthan100 {
    public static void main(String[] args) {
        int number;
        for (number = 2; number < 100; number++) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(number + "\t");
            }
        }
    }
}
