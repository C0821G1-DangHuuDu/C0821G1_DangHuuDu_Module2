package furamaResort.services.employee;

import furamaResort.models.Employee;
import furamaResort.models.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee implements IReadAndWriteFileEmployee {
    public ReadAndWriteFileEmployee(){};
    private static List<Person> employeeList=new ArrayList<>();


    @Override
    public void writeEmployeeList(Person employee) {

        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\employee.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Person> readEmployeeList() {
        employeeList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] employees = line.split(",");
                Person employee = new Employee(employees[0],employees[1],employees[2],employees[3],employees[4],employees[5],employees[6],employees[7],employees[8],Double.parseDouble(employees[9]));
                employeeList.add(employee);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
