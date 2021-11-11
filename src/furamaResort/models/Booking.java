package furamaResort.models;

import java.util.Date;

public class Booking {
    private String bookingID;
    private Date startDate;
    private Date endDate;
    private String customerID = new Customer().getId();
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String bookingID, Date startDate, Date endDate, String customerID, String serviceName, String typeOfService) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;

    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return bookingID + "," + startDate +"," + endDate +",'" + customerID + "," + serviceName +"," + typeOfService;
    }
}
