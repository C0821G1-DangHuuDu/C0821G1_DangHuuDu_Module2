package furamaResort.models;

public class Villa extends Facility {
    private String standardRoom;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String nameService, double usableArea, double rentPrice, byte maxOfPeople, String typeOfRent, String standardRoom, double poolArea, int numberOfFloor) {
        super(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.standardRoom +  "," + this.poolArea + "," + this.numberOfFloor;
    }
}
