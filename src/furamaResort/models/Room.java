package furamaResort.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double usableArea, double rentPrice, byte maxOfPeople, String typeOfRent, String freeService) {
        super(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + freeService;
    }
}
