package s06_inheritance_polymophism.bai_tap.Circle_Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString(){

        return "A Circle with radius = "+this.getRadius()+" and color = " + this.getColor();
    }
}
