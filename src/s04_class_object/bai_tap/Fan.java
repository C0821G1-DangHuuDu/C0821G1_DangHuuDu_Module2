package s04_class_object.bai_tap;

public class Fan {
    public static final int SLOW=1;//Khai báo hằng nên có public static.
    public static final int MEDIUM=2;//Khai báo hằng nên có public static.
    public static final int FAST=3;//Khai báo hằng nên có public static.
    private int speed=SLOW;
    private boolean on=false;
    private double radian=5;
    private String colour="blue";

    public Fan(){
    }

    public Fan(int speed,boolean on,double radian,String colour){
        this.speed=speed;
        this.on=on;
        this.radian=radian;
        this.colour=colour;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadian() {
        return this.radian;
    }

    public String getColour() {
        return this.colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadian(double radian) {
        this.radian = radian;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString(){
        String status="";
        if(this.on){
            status+="Tốc độ: "+speed+" Colour: "+colour+" Radian: "+radian+" Fan is on";
        }else {
            status+=" Colour: "+colour+" Radian: "+radian+" Fan is off";
        }
        return status;
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setOn(true);
        fan1.setSpeed(FAST);
        fan1.setRadian(6);
        fan1.setColour("white");
        System.out.println(fan1);

        Fan fan2 = new Fan(SLOW,false,8,"red");
        System.out.println(fan2);
    }
}
