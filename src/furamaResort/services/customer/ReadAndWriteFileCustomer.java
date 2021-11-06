package furamaResort.services.customer;

import furamaResort.models.Customer;
import furamaResort.models.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCustomer implements IReadAndWriteFileCustomer {
    public ReadAndWriteFileCustomer(){};
    private static List<Person> customerList=new ArrayList<>();


    @Override
    public void writeCustomerList(Person customer) {

        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Person> readCustomerList() {
        customerList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] customers = line.split(",");
                Person customer = new Customer(customers[0],customers[1],customers[2],customers[3],customers[4],customers[5],customers[6],customers[7],customers[8]);
                customerList.add(customer);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
