package furamaResort.models;

public class Customer extends Person{
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String birthDay, String gender, String identityCard, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, name, birthDay, gender, identityCard, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "," +typeOfCustomer + "," + address;
    }
}
