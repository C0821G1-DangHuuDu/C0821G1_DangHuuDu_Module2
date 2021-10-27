package s16_io_text_file.bai_tap.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static List<Country> readFile() {
        List<Country> countryList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s16_io_text_file\\bai_tap\\read_file\\Country.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readFile();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
