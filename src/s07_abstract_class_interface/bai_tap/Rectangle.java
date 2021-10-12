package s07_abstract_class_interface.bai_tap;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double length;

    public Rectangle (){
        this.length=this.width=1.0;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String getColor(){
        return super.getColor();
    }

    public void setColor (String color){
        super.setColor(color);
    }

    public boolean isFilled(){
        return super.isFilled();
    }

    public void setFilled (boolean filled){
        super.setFilled(filled);
    }
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + this.width + " and length= " + this.length + ", which is a subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength()+this.getLength()*percent);
        this.setWidth(this.getWidth()+this.getWidth()*percent);
    }
}
