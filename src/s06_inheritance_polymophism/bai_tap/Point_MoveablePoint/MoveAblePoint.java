package s06_inheritance_polymophism.bai_tap.Point_MoveablePoint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveAblePoint(){

    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] array={this.getXSpeed(),this.getYSpeed()};
        return array;
    }
    public String toString(){
        return Arrays.toString(super.getXY())+", speed= "+Arrays.toString(this.getSpeed());
    }
    public MoveAblePoint move(){
        super.setX(super.getX()+this.getXSpeed());
        super.setY(super.getY()+this.getYSpeed());
        return this; //return ở đây có ý nghĩa gì?
    }
}
