package furamaResort.services.employee;

import furamaResort.models.Employee;
import furamaResort.models.Person;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    ReadAndWriteFileEmployee readAndWriteFileEmployee = new ReadAndWriteFileEmployee();
    List<Person> employeeList;
    public EmployeeServiceImpl (){
        employeeList =readAndWriteFileEmployee.readEmployeeList();
    }
    public EmployeeServiceImpl(List<Person> employeeList){
        this.employeeList = employeeList;
    }
    Scanner input = new Scanner(System.in);

    @Override
    public void editEmployee() {
        // Nhập số thứ tự cần sửa.
        System.out.println("Enter Ordinal Numbers need to Edit");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("Enter ID Employee need to Edit: ");
        String id = input.nextLine();
        System.out.print("Enter Name Employee need to Edit: ");
        String name = input.nextLine();
        System.out.print("Enter Birthday of Employee need to Edit: ");
        String birthDay = input.nextLine();
        System.out.print("Enter Gender of Employee need to Edit: ");
        String gender = input.nextLine();
        System.out.print("Enter Identity Card of Employee need to Edit: ");
        String identityCard = input.nextLine();
        System.out.print("Enter Phone of Employee need to Edit: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Email of Employee need to Edit: ");
        String email = input.nextLine();
        System.out.print("Enter Level of Employee need to Edit: ");
        String level = input.nextLine();
        System.out.print("Enter Position of Employee need to Edit: ");
        String position = input.nextLine();
        System.out.print("Enter Salary of Employee need to Edit: ");
        double salary = Double.parseDouble(input.nextLine());

        Employee employee = new Employee(id,name,birthDay,gender,identityCard,phoneNumber,email,level,position,salary);
        //Vị trí cần sửa là bằng số thứ tự -1.
        employeeList.set(index-1,employee);

        for(int i=0;i<employeeList.size();i++){
            readAndWriteFileEmployee.writeEmployeeList(employeeList.get(i));
        }

        System.out.println("Edit Employee success!");

    }

    @Override
    public void addNew() {
        System.out.print("Enter ID Employee: ");
        String id = input.nextLine();
        System.out.print("Enter Name Employee: ");
        String name = input.nextLine();
        System.out.print("Enter Birthday of Employee: ");
        String birthDay = input.nextLine();
        System.out.print("Enter Gender of Employee: ");
        String gender = input.nextLine();
        System.out.print("Enter Identity Card of Employee: ");
        String identityCard = input.nextLine();
        System.out.print("Enter Phone of Employee: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Email of Employee: ");
        String email = input.nextLine();
        System.out.print("Enter Level of Employee: ");
        String level = input.nextLine();
        System.out.print("Enter Position of Employee: ");
        String position = input.nextLine();
        System.out.print("Enter Salary of Employee: ");
        double salary = Double.parseDouble(input.nextLine());

        Employee employee = new Employee(id,name,birthDay,gender,identityCard,phoneNumber,email,level,position,salary);
        employeeList.add(employee);
        readAndWriteFileEmployee.writeEmployeeList(employee);
        System.out.println("Add Employee success!");
    }

    @Override
    public void display() {

        for(int i=0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i));
        }
    }
}
