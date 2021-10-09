package s06_inheritance_polymophism.bai_tap.Point2D_Point3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array={this.getX(),this.getY()};
        return array;
    }

    public String toString(){
        return "Array of x and y is array = "+ Arrays.toString(this.getXY());
    }
}
