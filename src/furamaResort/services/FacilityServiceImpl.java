package furamaResort.services;

import furamaResort.models.Facility;
import furamaResort.models.House;
import furamaResort.models.Room;
import furamaResort.models.Villa;
import furamaResort.services.house.ReadAndWriteFileHouse;
import furamaResort.services.room.ReadAndWriteFileRoom;
import furamaResort.services.villa.ReadAndWriteFileVilla;
import furamaResort.utils.Validate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    ReadAndWriteFileVilla readAndWriteFileVilla = new ReadAndWriteFileVilla();
    ReadAndWriteFileHouse readAndWriteFileHouse = new ReadAndWriteFileHouse();
    ReadAndWriteFileRoom readAndWriteFileRoom = new ReadAndWriteFileRoom();
    Map<Facility, Integer> facilityMap;

    public FacilityServiceImpl() {
        this.facilityMap = readAll();

    }

    public Map<Facility, Integer> readAll() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        Map<Facility, Integer> villaMap = readAndWriteFileVilla.readVillaList();
        Map<Facility, Integer> houseMap = readAndWriteFileHouse.readHouseList();
        Map<Facility, Integer> roomMap = readAndWriteFileRoom.readRoomList();
        for (Map.Entry<Facility, Integer> villa : villaMap.entrySet()) {
            facilityMap.put(villa.getKey(),villa.getValue());
        }
        for (Map.Entry<Facility, Integer> house : houseMap.entrySet()) {
            facilityMap.put(house.getKey(),house.getValue());
        }
        for (Map.Entry<Facility, Integer> room : roomMap.entrySet()) {
            facilityMap.put(room.getKey(),room.getValue());
        }
        return facilityMap;
    }

    public FacilityServiceImpl(Map facilityMap) {
        this.facilityMap = facilityMap;
    }

    Scanner input = new Scanner(System.in);

    //add New Room
    @Override
    public void addNew() {
//        int count =0;
        System.out.print("Enter ID Name Service: ");
        String nameService = Validate.checkNameService(input.nextLine());
        System.out.print("Enter Usable Area: ");
        double usableArea = Double.parseDouble(input.nextLine());
        System.out.print("Enter Rent Price: ");
        double rentPrice = Validate.checkRentPrice(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Max Of People: ");
        byte maxOfPeople = Validate.checkMaxOfPeople(Byte.parseByte(input.nextLine()));
        System.out.print("Enter Type Of Rent: ");
        String typeOfRent = Validate.checkTypeOfRent(input.nextLine());
        System.out.print("Enter free Service: ");
        String freeService = input.nextLine();
        Room room = new Room(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent, freeService);
        facilityMap.put(room, 0);
        readAndWriteFileRoom.writeRoomList(room);
        System.out.println("Add success!");
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityMap.entrySet()) {
            System.out.println(facility.getKey().toString());
        }
    }

    @Override
    public void addNewVilla() {

        System.out.print("Enter ID Name Service: ");
        String nameService = Validate.checkNameService(input.nextLine());
        System.out.print("Enter Usable Area: ");
        double usableArea = Double.parseDouble(input.nextLine());
        System.out.print("Enter Rent Price: ");
        double rentPrice = Validate.checkRentPrice(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Max Of People: ");
        byte maxOfPeople = Validate.checkMaxOfPeople(Byte.parseByte(input.nextLine()));
        System.out.print("Enter Type Of Rent: ");
        String typeOfRent = Validate.checkTypeOfRent(input.nextLine());
        System.out.print("Enter Standard Villa: ");
        String standardRoom = Validate.checkStandardRoom(input.nextLine());
        System.out.print("Enter Pool Area: ");
        double poolArea = Validate.checkPoolArea(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Number Of Floor: ");
        int numberOfFloor = Validate.checkNumberOfFloor(Integer.parseInt(input.nextLine()));

        Villa villa = new Villa(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent, standardRoom, poolArea, numberOfFloor);
        facilityMap.put(villa, 0);
        readAndWriteFileVilla.writeVillaList(villa);
        System.out.println("Add success!");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Enter ID Name Service: ");
        String nameService = Validate.checkNameService(input.nextLine());
        System.out.print("Enter Usable Area: ");
        double usableArea = Double.parseDouble(input.nextLine());
        System.out.print("Enter Rent Price: ");
        double rentPrice = Validate.checkRentPrice(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Max Of People: ");
        byte maxOfPeople = Validate.checkMaxOfPeople(Byte.parseByte(input.nextLine()));
        System.out.print("Enter Type Of Rent: ");
        String typeOfRent = Validate.checkTypeOfRent(input.nextLine());
        System.out.print("Enter Standard House: ");
        String standardRoom = Validate.checkStandardRoom(input.nextLine());
        System.out.print("Enter Number Of Floor: ");
        int numberOfFloor = Validate.checkNumberOfFloor(Integer.parseInt(input.nextLine()));

        House house = new House(nameService, usableArea, rentPrice, maxOfPeople, typeOfRent, standardRoom, numberOfFloor);
        facilityMap.put(house, 0);
        readAndWriteFileHouse.writeHouseList(house);
        System.out.println("Add success!");
    }

    @Override
    public void displayFacilityMaintenance() {

    }
}
