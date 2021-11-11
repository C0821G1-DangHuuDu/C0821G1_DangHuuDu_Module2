package furamaResort.services.booking;

import furamaResort.models.Booking;
import furamaResort.utils.Validate;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceIplm implements BookingService{
    Scanner input = new Scanner(System.in);
    Set<Booking> bookingSet = new TreeSet<>();


    @Override
    public void addNew() {
        System.out.print("Enter ID Booking: ");
        String id = input.nextLine();
        System.out.print("Enter Start Day: ");
        Date startDay = Validate.checkDay(input.nextLine());
        System.out.print("Enter End Day: ");
        Date endDay = Validate.checkDay(input.nextLine());
        System.out.print("Enter Customer ID Booking: ");
        String customerID = input.nextLine();
        System.out.print("Enter Service Name Booking: ");
        String serviceName = input.nextLine();
        System.out.print("Enter Type Of Service  Booking: ");
        String typeOfService = input.nextLine();
        Booking booking = new Booking(id,startDay,endDay,customerID,serviceName,typeOfService);
        bookingSet.add(booking);
    }

    @Override
    public void display() {
        for (Booking booking:bookingSet){
            System.out.println(booking);
        }
    }
}
