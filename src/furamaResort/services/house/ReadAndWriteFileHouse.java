package furamaResort.services.house;

import furamaResort.models.Facility;
import furamaResort.models.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFileHouse implements IReadAndWriteFileHouse {
    public ReadAndWriteFileHouse(){};
    public static Map<Facility,Integer> houseMap=new LinkedHashMap();


    @Override
    public void writeHouseList(Facility house) {

        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\house.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Map<Facility,Integer> readHouseList() {
        houseMap=new LinkedHashMap();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] houses = line.split(",");
                Facility house = new House(houses[0],Double.parseDouble(houses[1]),Double.parseDouble(houses[2]),Byte.parseByte(houses[3]),houses[4],houses[5],Integer.parseInt(houses[6]));
                houseMap.put(house,0);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseMap;
    }
}
