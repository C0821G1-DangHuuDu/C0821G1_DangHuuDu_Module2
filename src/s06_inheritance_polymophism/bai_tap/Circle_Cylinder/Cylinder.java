package s06_inheritance_polymophism.bai_tap.Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this.height=1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height){
        this.height=height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getRadius()*super.getRadius()*Math.PI*this.height;
    }

@Override
    public String toString(){
        return "A Cylinder with height = "+this.getHeight()+", which is a subclass of " + super.toString();
    }
}
