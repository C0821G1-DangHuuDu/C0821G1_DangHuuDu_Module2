package furamaResort.services.customer;

import furamaResort.models.Customer;
import furamaResort.models.Person;
import furamaResort.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    Scanner input = new Scanner(System.in);
    ReadAndWriteFileCustomer readAndWriteFileCustomer = new ReadAndWriteFileCustomer();
    List<Person> customerList;
    public CustomerServiceImpl (){
        customerList=readAndWriteFileCustomer.readCustomerList();
    }
    public CustomerServiceImpl(List customerList){
        this.customerList=customerList;
    }

    @Override
    public void editCustomer() {
        // Nhập số thứ tự cần sửa.
        System.out.println("Enter Ordinal Numbers need to Edit");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("Enter ID Customer need to Edit: ");
        String id = input.nextLine();
        System.out.print("Enter Name Customer need to Edit: ");
        String name = input.nextLine();
        System.out.print("Enter Birthday of Customer need to Edit: ");
        String birthDay = input.nextLine();
        System.out.print("Enter Gender of Customer need to Edit: ");
        String gender = input.nextLine();
        System.out.print("Enter Identity Card of Customer need to Edit: ");
        String identityCard = input.nextLine();
        System.out.print("Enter Phone of Customer need to Edit: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Email of Customer need to Edit: ");
        String email = input.nextLine();
        System.out.print("Enter Address of Customer need to Edit: ");
        String address = input.nextLine();
        System.out.print("Enter Type of Customer need to Edit: ");
        String typeOfCustomer = input.nextLine();

        Customer customer = new Customer(id,name,birthDay,gender,identityCard,phoneNumber,email,typeOfCustomer,address);
        customerList.set(index-1, customer);
        for(int i=0;i<customerList.size();i++){
            readAndWriteFileCustomer.writeCustomerList(customerList.get(i));
        }
        System.out.println("Edit Customer success!");
    }

    @Override
    public void addNew() {
        System.out.print("Enter ID Customer: ");
        String id = input.nextLine();
        System.out.print("Enter Name Customer: ");
        String name = input.nextLine();
        System.out.print("Enter Birthday of Customer: ");
        String birthDay = input.nextLine();
        System.out.print("Enter Gender of Customer: ");
        String gender = Validate.checkGender(input.nextLine());
        System.out.print("Enter Identity Card of Customer: ");
        String identityCard = input.nextLine();
        System.out.print("Enter Phone of Customer: ");
        String phoneNumber = Validate.checkPhone(input.nextLine());
        System.out.print("Enter Email of Customer: ");
        String email = input.nextLine();
        System.out.print("Enter Address of Customer: ");
        String address = input.nextLine();
        System.out.print("Enter Type of Customer: ");
        String typeOfCustomer = Validate.checkTypeOfCustomer(input.nextLine());

        Customer customer = new Customer(id,name,birthDay,gender,identityCard,phoneNumber,email,typeOfCustomer,address);
        customerList.add(customer);
        readAndWriteFileCustomer.writeCustomerList(customer);
        System.out.println("Add Customer success!");
    }

    @Override
    public void display() {
        customerList=readAndWriteFileCustomer.readCustomerList();
        for(int i=0;i<customerList.size();i++){
            System.out.println(customerList.get(i));
        }
    }
}
