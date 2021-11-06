package furamaResort.services.customer;

import furamaResort.models.Person;

import java.util.List;

public interface IReadAndWriteFileCustomer {
    public void writeCustomerList(Person customer);
    public List<Person> readCustomerList();
}
