package s16_io_text_file.bai_tap.copy_fle_text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
    /*Buoc 1: doc duoc noi dung cua source file.*/
    public static String readFile(FileReader fileReader){
        int i;
        String result="";
        while (true) {
            try {
                while ((i=fileReader.read())!= -1) {
                    result += (char) i;//hàm read() trả về kiểu int nên phải ép kiểu sang kiểu char để hiển thị.
                }
                fileReader.close();
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*Buoc 2: ghi noi dung da doc vao target file*/
    public static void writeFile(FileWriter fileWriter,String content){
        try {
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Write success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*Buoc 3: Thực hiện trong hàm main*/
    public static void main(String[] args) {
        FileReader fileReader= null;
        String result = "";
        try {

            fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s16_io_text_file\\bai_tap\\copy_fle_text\\sourceFile.txt");
            result+=ReadAndWrite.readFile(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ReadAndWrite.writeFile(new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s16_io_text_file\\bai_tap\\copy_fle_text\\targetFile.txt"),result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
