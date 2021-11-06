package furamaResort.models;

public class Contract {
    private String numberOfContract;
    private String bookingID = new Booking().getBookingID();
    private double prepaidAmount;
    private double totalAmount;
    private String customerID=new Customer().getId();

    public Contract() {
    }

    public Contract(String numberOfContact, String bookingID, double prepaidAmount, double totalAmount, String customerID) {
        this.numberOfContract = numberOfContact;
        this.bookingID = bookingID;
        this.prepaidAmount = prepaidAmount;
        this.totalAmount = totalAmount;
        this.customerID = customerID;
    }

    public String getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(String numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(double prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

}
