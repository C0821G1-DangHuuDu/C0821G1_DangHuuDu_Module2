package furamaResort.models;

public abstract class Facility {
    private String nameService;
    private double usableArea;
    private double rentPrice;
    private byte maxOfPeople;
    private String typeOfRent;

    public Facility() {
    }

    public Facility(String nameService, double usableArea, double rentPrice, byte maxOfPeople, String typeOfRent) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentPrice = rentPrice;
        this.maxOfPeople = maxOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public byte getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(byte maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return nameService + "," + usableArea + "," + rentPrice + "," + maxOfPeople + "," + typeOfRent;
    }
}
