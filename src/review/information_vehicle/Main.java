package review.information_vehicle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Tạo đối tượng xe và nhập thông tin.");
        System.out.println("2.Xuất bảng kê khai tiền thuế của các xe.");
        System.out.println("3.Thoát.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chức năng bạn muốn thực hiện: ");
        byte input=Byte.parseByte(scanner.nextLine());
        int count=0;
        Vehicle[] vehicle=new Vehicle[10];
        String name;
        String model;
        double volume;
        int price;
        double tax;
        while(input==1||input==2){
            if (input == 1) {
                System.out.print("Nhập tên phương tiện: ");
                name=scanner.nextLine();
                System.out.print("Phiên bản: ");
                model=scanner.nextLine();
                System.out.print("Dung tích xi lanh: ");
                volume=Double.parseDouble(scanner.nextLine());
                System.out.print("Giá của phương tiện: ");
                price=Integer.parseInt(scanner.nextLine());
                vehicle[count]=new Vehicle(name,model,volume,price);
                count++;
                System.out.print("Nhập vào chức năng bạn muốn thực hiện tiếp: ");
                input=Byte.parseByte(scanner.nextLine());
            } else if (input == 2){
                System.out.println(Arrays.toString(vehicle));
                System.out.print("Nhập vào chức năng bạn muốn thực hiện tiếp: ");
                input=Byte.parseByte(scanner.nextLine());
            }else {
                System.out.println("Exit");
            }
        }

    }
}
