package furamaResort.controllers;

import furamaResort.services.customer.CustomerServiceImpl;
import furamaResort.services.employee.EmployeeServiceImpl;
import furamaResort.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService=new FacilityServiceImpl();
    public static void displayMainMenu() {

        int choose;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("----------MENU----------");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");

            System.out.print("Enter your choose: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:

                    do {
                        System.out.println("----------Employee Management----------");
                        System.out.println("1\tDisplay list employees");
                        System.out.println("2\tAdd new employee");
                        System.out.println("3\tEdit employee");
                        System.out.println("4\tReturn main menu");

                        System.out.print("Enter your choose with Employee: ");
                        choose = Integer.parseInt(input.nextLine());

                        switch (choose){
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.addNew();
                                break;
                            case 3:
                                employeeService.editEmployee();
                                break;
                            case 4:
                                displayMainMenu();
                        }

                    }while (choose>=1||choose<=4);

                case 2:

                    do {
                        System.out.println("----------Customer Management----------");
                        System.out.println("1.\tDisplay list customers");
                        System.out.println("2.\tAdd new customer");
                        System.out.println("3.\tEdit customer");
                        System.out.println("4.\tReturn main menu");

                        System.out.print("Enter your choose with Customer: ");
                        choose = Integer.parseInt(input.nextLine());

                        switch (choose){
                            case 1:
                                customerService.display();
                                break;
                            case 2:
                                customerService.addNew();
                                break;
                            case 3:
                                customerService.editCustomer();
                                break;
                            case 4:
                                displayMainMenu();
                        }

                    }while (choose>=1||choose<=4);

                case 3:

                    do {
                        System.out.println("----------Facility Management----------");
                        System.out.println("1\tDisplay list facility");
                        System.out.println("2\tAdd new facility");
                        System.out.println("3\tDisplay list facility maintenance");
                        System.out.println("4\tReturn main menu");

                        System.out.print("Enter your choose with Facility: ");
                        choose = Integer.parseInt(input.nextLine());

                        switch (choose){
                            case 1:
                                facilityService.display();
                                break;
                            case 2:
                                do {
                                    System.out.println("----------Add new facility----------");
                                    System.out.println("1.\tAdd New Villa");
                                    System.out.println("2.\tAdd New House");
                                    System.out.println("3.\tAdd New Room");
                                    System.out.println("4.\tBack to menu");
                                    System.out.print("Enter your choose with Add Facility: ");
                                    choose = Integer.parseInt(input.nextLine());
                                    switch (choose) {
                                        case 1:
                                            facilityService.addNewVilla();
                                            break;
                                        case 2:
                                            facilityService.addNewHouse();
                                            break;
                                        case 3:
                                            facilityService.addNew();
                                            break;
                                        case 4:
                                            displayMainMenu();
                                    }

                                }while (choose>=1||choose<=4);
                            case 3:
                                facilityService.displayFacilityMaintenance();
                                break;
                            case 4:
                                displayMainMenu();
                        }

                    }while (choose>=1||choose<=4);
                case 4:
                    do {
                        System.out.println("----------Booking Manager----------");
                        System.out.println("1.\tAdd new booking");
                        System.out.println("2.\tDisplay list booking");
                        System.out.println("3.\tCreate new contracts");
                        System.out.println("4.\tDisplay list contracts");
                        System.out.println("5.\tEdit contracts");
                        System.out.println("6.\tReturn main menu");

                        System.out.print("Enter your choose with Booking: ");
                        choose = Integer.parseInt(input.nextLine());

                        switch (choose) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                displayMainMenu();
                        }


                    }while (choose>=1||choose<=6);
                case 5:
                    System.out.println("1.\tDisplay list customers use service");
                    System.out.println("2.\tDisplay list customers get voucher");
                    System.out.println("3.\tReturn main menu");
                    break;
            }
        } while (choose != 6);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
