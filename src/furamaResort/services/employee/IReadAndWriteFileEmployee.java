package furamaResort.services.employee;

import furamaResort.models.Person;

import java.util.List;

public interface IReadAndWriteFileEmployee {
    public void writeEmployeeList(Person employee);
    public List<Person> readEmployeeList();
}
