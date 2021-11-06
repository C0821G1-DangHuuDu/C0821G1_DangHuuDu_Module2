package furamaResort.services.villa;

import furamaResort.models.Facility;
import furamaResort.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFileVilla implements IReadAndWriteFileVilla {
    public ReadAndWriteFileVilla(){};
    public static Map<Facility,Integer> villaMap=new LinkedHashMap();


    @Override
    public void writeVillaList(Facility villa) {

        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Map<Facility,Integer> readVillaList() {
        villaMap=new LinkedHashMap();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] Villas = line.split(",");
                Facility villa = new Villa(Villas[0],Double.parseDouble(Villas[1]),Double.parseDouble(Villas[2]),Byte.parseByte(Villas[3]),Villas[4],Villas[5],Double.parseDouble(Villas[6]),Integer.parseInt(Villas[7]));
                villaMap.put(villa,0);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaMap;
    }
}
