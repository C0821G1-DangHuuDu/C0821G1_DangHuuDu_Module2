package review.manage_student.model;

public class Student {
    private String studentID;
    private String studentName;
    private String studentAddress;
    private double studentPoint;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentAddress, double studentPoint) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentPoint = studentPoint;
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public double getStudentPoint() {
        return this.studentPoint;
    }

    public void setStudentPoint(double studentPoint) {
        this.studentPoint = studentPoint;
    }

    public String toString(){
        return "ID: "+this.getStudentID()+" - Name: "+this.getStudentName()+
                " - Address: "+this.getStudentAddress()+" - Point: "+this.getStudentPoint();
    }
}
