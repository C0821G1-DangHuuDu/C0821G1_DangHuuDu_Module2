package review.manage_student.controller;

import review.manage_student.model.Student;
import review.manage_student.service.ManageStudent;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManageStudent manageStudentObj = new ManageStudent();
        Student student1=new Student("001","A","HN",7);
        Student student2=new Student("002","B","DN",8);
        Student student3=new Student("003","C","QN",6);
        Student student4=new Student("004","D","SG",5);
        manageStudentObj.add(student1);
        manageStudentObj.add(student2);
        manageStudentObj.add(student3);
        manageStudentObj.add(student4);


        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm mới sinh viên:");
            System.out.println("2. Xem danh sách Sinh viên:");
            System.out.println("3. Sửa thông tin Sinh viên:");
            System.out.println("4. Xoá Sinh viên khỏi danh sách:");
            System.out.println("5. Kiểm tra Sinh viên mã số YYYY có trong danh sách chưa:");
            System.out.println("6. Tìm kiếm sinh viên theo mã số:");
            System.out.println("7. Sắp xếp danh sách Sinh viên theo điểm số:");
            System.out.println("8. EXit");

            System.out.print("Mời bạn chọn chức năng: ");
            choose=Integer.parseInt(input.nextLine());

            switch (choose){
                case 1:
                    manageStudentObj.addNewStudent();
                    break;
                case 2:
                    manageStudentObj.showAll();
                    break;
                case 3:
                    manageStudentObj.editStudent();
                    break;
                case 4:
                    manageStudentObj.deleteStudent();
                    break;
                case 5:
                    System.out.println(manageStudentObj.findIDStudent());
                    break;
                case 6:
                    manageStudentObj.showStudent();
                    break;
                case 7:
                    manageStudentObj.sapxep();
                    break;
            }

        }while (choose!=8);
    }



}
