package s05_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius=1.0;
    private String colour= "red";

    public Circle(){

    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5.0);

        System.out.println("The circle has radius: "+circle1.getRadius());
        System.out.println("The circle has area: "+circle1.getArea());
    }
}
