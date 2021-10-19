package review.manage_student.service;

import review.manage_student.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageStudent extends Student implements ServiceStudent {
    Scanner input = new Scanner(System.in);
    //Cách này cũng được nhưng không hay nên tạo constructor cho class này.
//    List<Student> studentsList = new ArrayList<Student>();

    //Cách tạo constructor:
    List<Student> studentsList;

    public ManageStudent() {
        studentsList = new ArrayList<>();
    }

    public ManageStudent(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập vị trí cần thêm mới");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("Nhập id cần thêm mới");
        String id = input.nextLine();
        System.out.println("Nhập tên cần thêm mới");
        String name = (input.nextLine());
        System.out.println("Nhập địa chỉ cần thêm mới");
        String address = (input.nextLine());
        System.out.println("Nhập điểm cần thêm mới");
        int point = Integer.parseInt(input.nextLine());
        Student student = new Student(id, name, address, point);
        studentsList.add(index, student);
        System.out.println("Bạn đã thêm thành công");
    }

    @Override
    public void showAll() {
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }
    }

    @Override
    public void editStudent() {
        System.out.println("Nhập vị trí cần sửa");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("Nhập id cần sửa");
        String id = input.nextLine();
        System.out.println("Nhập tên cần sửa");
        String name = (input.nextLine());
        System.out.println("Nhập địa chỉ cần sửa");
        String address = (input.nextLine());
        System.out.println("Nhập điểm cần sửa");
        int point = Integer.parseInt(input.nextLine());
        Student student = new Student(id, name, address, point);
        studentsList.set(index, student);
        System.out.println("Bạn đã sửa thành công");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Nhập vị trí cần sửa");
        int index = Integer.parseInt(input.nextLine());
        studentsList.remove(index);
    }

    @Override
    public boolean findIDStudent() {
        System.out.println("Nhập vào ID cần kiểm tra");
        String id = input.nextLine();
        boolean check=false;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getStudentID().equals(id)) {
                System.out.println("ID bạn tìm ở vị trí: " + i);
                studentsList.get(i);
                check=true;
                break;
            } else {
                check=false;
            }
        }
        return check;
    }

    @Override
    public void showStudent() {
//        System.out.println("Nhập vào ID cần tìm");
//        String id = input.nextLine();
//        for (int i = 0; i < studentsList.size(); i++) {
//            if (studentsList.get(i).getStudentID() == id) {
//                System.out.println(studentsList.get(i));
//            } else {
//                System.out.println("ID bạn tìm không có trong danh sách");
//            }
//        }
        findIDStudent();
        if(findIDStudent()==false){
            System.out.println("ID bạn tìm không có trong danh sách");
        }
    }

    public void sapxep() {
        Collections.sort(studentsList);
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }
    }
    public void add(Student student){
        studentsList.add(student);
    }
}
