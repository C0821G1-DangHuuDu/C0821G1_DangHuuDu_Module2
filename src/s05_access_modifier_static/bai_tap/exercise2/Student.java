package s05_access_modifier_static.bai_tap.exercise2;

public class Student {
    private String name="John";
    private String classes="C02";

    public Student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student1=new Student();
        student1.setName("Huu Du");
        student1.setClasses("C08");
        System.out.println("Name of Student is "+student1.name);
        System.out.println("Class of Student is "+student1.classes);
    }
}
