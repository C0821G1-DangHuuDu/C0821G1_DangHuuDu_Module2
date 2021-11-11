package furamaResort.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner input = new Scanner(System.in);

    public static String checkNameService(String nameService) {
        try {
            while (!Pattern.matches("^[A-Z][a-z]*$", nameService)) {
                System.out.println("Not Right!.");
                System.out.print("Enter Name Service again: ");
                nameService = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nameService;
    }

    public static double checkPoolArea(double poolArea) {
        if (poolArea <= 30) {
            System.out.println("Not Right!Pool Area must be great than 30.\n");
            System.out.print("Enter Pool Area again: ");
            poolArea = Double.parseDouble(input.nextLine());
            checkPoolArea(poolArea);
        }
        return poolArea;
    }

    public static double checkRentPrice(double rentPrice) {
        if (rentPrice < 0) {
            System.err.println("Not Right!Rent Price must be great than 0.\n");
            System.out.print("Enter Rent Price again: ");
            rentPrice = Double.parseDouble(input.nextLine());
            checkPoolArea(rentPrice);
        }
        return rentPrice;
    }

    public static byte checkMaxOfPeople(byte maxOfPeople) {
        if (maxOfPeople < 0 || maxOfPeople > 20) {
            System.out.println("Not Right!Max Of People must be great than 0 and less than 20.");
            System.out.print("Enter Max Of People again: ");
            maxOfPeople = Byte.parseByte(input.nextLine());
            checkPoolArea(maxOfPeople);
        }
        return maxOfPeople;
    }

    public static int checkNumberOfFloor(int numberOfFloor) {
        if (numberOfFloor < 0) {
            System.out.println("Not Right!Number Of Floor must be great than 0.");
            System.out.print("Enter Number Of Floor again: ");
            numberOfFloor = Integer.parseInt(input.nextLine());
            checkPoolArea(numberOfFloor);
        }
        return numberOfFloor;
    }

    public static String checkTypeOfRent(String typeOfRent) {
        try {
            while (!Pattern.matches("^[A-Z][a-z]*$", typeOfRent)) {
                System.out.println("Not Right!.");
                System.out.print("Enter Type Of Rent again: ");
                typeOfRent = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return typeOfRent;
    }
    public static String checkStandardRoom(String standardRoom) {
        try {
            while (!Pattern.matches("^[A-Z][a-z]*$", standardRoom)) {
                System.out.println("Not Right!.");
                System.out.print("Enter Type Of Rent again: ");
                standardRoom = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return standardRoom;
    }

    public static String checkLevel(String level){
        while(!(level.equals("Intermediate")||level.equals("College")||level.equals("University")||level.equals("Postgraduate"))){
            System.out.print("Enter Level again (Intermediate/College/University/Postgraduate): ");
            level = input.nextLine();
            checkLevel(level);
        }

        return level;
    }
    public static String checkPosition(String position){
        while(!(position.equals("Receptionist")||position.equals("Waiter")||position.equals("Expert")||position.equals("Supervise")||position.equals("Manager")||position.equals("Director"))){
            System.out.print("Enter Level again (Receptionist/Waiter/Expert/Supervise/Manager/Director): ");
            position = input.nextLine();
            checkLevel(position);
        }

        return position;
    }
    public static String checkGender(String gender){
        while(!(gender.equals("Male")||gender.equals("Female"))){
            System.out.print("Enter Level again (Male/Female): ");
            gender = input.nextLine();
            checkLevel(gender);
        }

        return gender;
    }

    public static String checkPhone(String phone) {
        try {
            while (!Pattern.matches("^(0)[0-9]{9}$", phone)) {
                System.out.println("Not Right!.");
                System.out.print("Enter Phone again (10 number and 0xxxxxxxxx): ");
                phone = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return phone;
    }
    public static String checkTypeOfCustomer(String typeOfCustomer){
        while(!(typeOfCustomer.equals("Diamond")||typeOfCustomer.equals("Platinium")||typeOfCustomer.equals("Gold")||typeOfCustomer.equals("Silver")||typeOfCustomer.equals("Member"))){
            System.out.print("Enter Level again (Receptionist/Waiter/Expert/Supervise/Manager/Director): ");
            typeOfCustomer = input.nextLine();
            checkLevel(typeOfCustomer);
        }

        return typeOfCustomer;
    }
    public static Date checkDay(String birthDay){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        try {
            date = dateFormat.parse(birthDay);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.print("Enter Type Of Rent again: ");
            birthDay = input.nextLine();
            checkDay(birthDay);
        }
        return date;
    }
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter Type Of Rent again: ");
       String birthDay = input.nextLine();
      Date date = checkDay(birthDay);
        System.out.println(dateFormat.format(date));
    }
}