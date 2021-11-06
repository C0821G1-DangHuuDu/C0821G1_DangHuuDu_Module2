package furamaResort.models;

public class House extends Facility{
    private String standardRoom;
    private int numberOfFloor;

    public House() {
    }

    public House(String nameService, double usableArea, double rentPrice, byte maxOfPeople, String typeOfRent, String standardRoom, int numberOfFloor) {
        super(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+","  + standardRoom +"," + numberOfFloor;
    }
}
