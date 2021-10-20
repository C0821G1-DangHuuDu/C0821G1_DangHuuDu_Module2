package s12_map.thuc_hanh.hashmap_hashset;

public class Student {
    private String studentName;
    private int studentOld;
    private String studentAddress;
    public Student(){

    }

    public Student(String studentName, int studentAge, String studentAddress) {
        this.studentName = studentName;
        this.studentOld = studentAge;
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentOld() {
        return studentOld;
    }

    public void setStudentOld(int studentOld) {
        this.studentOld = studentOld;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentOld=" + studentOld +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
