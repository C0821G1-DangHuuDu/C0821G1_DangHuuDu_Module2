package s03_method.thuc_hanh;

import java.util.Scanner;

public class FindElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.print("Input name need to find: ");
        String name = input.nextLine();
        boolean check= false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println(name + " at index " + i + " in students array");
                check=true;
                break;
            } else {
                check= false;
            }
        }
        if (check==false){
            System.out.println("Not found " + name + " in students array");
        }
    }

}
