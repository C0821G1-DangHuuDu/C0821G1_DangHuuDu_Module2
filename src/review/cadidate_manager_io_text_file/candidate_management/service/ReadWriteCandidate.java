package review.cadidate_manager_io_text_file.candidate_management.service;

import review.cadidate_manager_io_text_file.candidate_management.model.Candidate;
import review.cadidate_manager_io_text_file.candidate_management.model.ExperienceCandidate;
import review.cadidate_manager_io_text_file.candidate_management.model.FresherCandidate;
import review.cadidate_manager_io_text_file.candidate_management.model.InternCandidate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCandidate implements IReadWriteCadidate {
    public ReadWriteCandidate(){};
    private static List<Candidate> candidateList=new ArrayList<>();

    @Override
    public List readExperienceCandidateList() {
        candidateList=new ArrayList<>();
        try {
            // B1: Tạo FileReader chứa đường dẫn muốn đọc file.
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\ExperienceCandidateList.csv");
            // B2: Tạo bộ nhớ đệm với BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // B3: Tạo 1 biến line để chứa dòng cần đọc
            String line;
            // B4: Dùng while để đọc từng dòng trong file cho đến khi line = null.
            while ((line = bufferedReader.readLine())!=null){
            // B5: khai báo 1 biến mảng chứa dòng vừa đọc và dùng hàm line.split để bỏ dấu "," để tạo mảng.
                String[] experienceCandidates =line.split(",");
            // B6: Tạo 1 đối tượng experienceCandidate với các tham số trong mảng vừa tạo ở B5.
                Candidate experienceCandidate = new ExperienceCandidate(Integer.parseInt(experienceCandidates[0]),experienceCandidates[1],experienceCandidates[2],Short.parseShort(experienceCandidates[3]),experienceCandidates[4],experienceCandidates[5],experienceCandidates[6],Byte.parseByte(experienceCandidates[7]),Byte.parseByte(experienceCandidates[8]),experienceCandidates[9]);
            // B7: add đối tượng vừa tạo ở B6 vào list
                candidateList.add(experienceCandidate);
            }
            // B8: đóng file vừa đọc với close.
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // B9: trả về list vừa tạo.
        return candidateList;
    }

    @Override
    public List readFresherCandidateList() {
        candidateList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\FresherCandidateList.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] fresherCandidates = line.split(",");
                Candidate fresherCandidate = new FresherCandidate(Integer.parseInt(fresherCandidates[0]),fresherCandidates[1],fresherCandidates[2],Short.parseShort(fresherCandidates[3]),fresherCandidates[4],fresherCandidates[5],fresherCandidates[6],Byte.parseByte(fresherCandidates[7]),fresherCandidates[8],fresherCandidates[9],fresherCandidates[10]);
                candidateList.add(fresherCandidate);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }

    @Override
    public List readInternCandidateList() {
        candidateList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\InternCandidateList.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!= null){
                String[] internCandidates=line.split(",");
                Candidate internCandidate=new InternCandidate(Integer.parseInt(internCandidates[0]),internCandidates[1],internCandidates[2],Short.parseShort(internCandidates[3]),internCandidates[4],internCandidates[5],internCandidates[6],Byte.parseByte(internCandidates[7]),internCandidates[8],internCandidates[9],internCandidates[10]);
                candidateList.add(internCandidate);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidateList;
    }

    @Override
    public void writeExperienceCandidateList(Candidate experienceCandidateList) {
        try {
            // B1: Tạo 1 FileWriter chứa đường dẫn file để ghi (Lưu ý: dùng appen: true để ghi tiếp/false để ghi đè).
            FileWriter fileWriter=new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\ExperienceCandidateList.csv",true);
            // B2: Tạo 1 vùng ghi bộ nhớ đệm với BufferWriter
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            // B3: Dùng hàm bufferedWriter.write() để viết vào file.
            bufferedWriter.write(experienceCandidateList.toString());
            // B4: Sau khi viết xong thì tạo 1 dòng mới với newline.
            bufferedWriter.newLine();
            // B5: Viết xong thì đóng file lại với close.
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFresherCandidateList(Candidate fresherCandidateList) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\FresherCandidateList.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(fresherCandidateList.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void writeInternCandidateList(Candidate internCandidateList) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\review\\cadidate_manager_io_text_file\\candidate_management\\model\\InternCandidateList.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter( fileWriter);
            bufferedWriter.write(internCandidateList.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        ReadWriteCandidate readWriteCandidate= new ReadWriteCandidate();
        readWriteCandidate.readExperienceCandidateList();
        for (int i = 0; i < candidateList.size(); i++) {
            System.out.println(candidateList.get(i));
        }
    }
}
