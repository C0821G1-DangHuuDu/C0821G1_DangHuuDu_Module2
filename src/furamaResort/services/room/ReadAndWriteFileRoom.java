package furamaResort.services.room;

import furamaResort.models.Facility;
import furamaResort.models.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFileRoom implements IReadAndWriteFileRoom {
    public ReadAndWriteFileRoom(){};
    public static Map<Facility,Integer> roomMap=new LinkedHashMap();


    @Override
    public void writeRoomList(Facility room) {

        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Map<Facility,Integer> readRoomList() {
        roomMap=new LinkedHashMap();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\furamaResort\\data\\room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] rooms = line.split(",");
                Facility room = new Room(rooms[0],Double.parseDouble(rooms[1]),Double.parseDouble(rooms[2]),Byte.parseByte(rooms[3]),rooms[4],rooms[5]);
                roomMap.put(room,0);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }
}
