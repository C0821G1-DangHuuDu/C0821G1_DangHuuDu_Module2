package s08_clean_code.thuc_hanh.refactoring_introduction_variable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if(isDivisibleBy3 && isDivisibleBy5)
            return "FizzBuzz";

        if(isDivisibleBy3)
            return "Fizz";

        if(isDivisibleBy5)
            return "Buzz";

        return number + "";
    }
}
