package s06_inheritance_polymophism.thuc_hanh;

public class Square extends Rectangle {
    public Square(double size){
        super.setWidth(size);
        super.setLength(size);
    }

    public Square(){
        super.setWidth(1.0);
        super.setLength(1.0);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.setSize(size);
        this.setWidth(size);
    }

    public double getSize(){
        return super.getLength();
    }

    public void setSize(double size){
        super.setLength(size);
    }

    @Override
    public void setWidth(double size){
       super.setWidth(size);
    }
    public double getWidth(){
        return this.getSize();
    }


    @Override
    public String toString() {
        return "A Square with size= " + this.getSize() + ", which is a subclass of "+ super.toString();
    }
}
