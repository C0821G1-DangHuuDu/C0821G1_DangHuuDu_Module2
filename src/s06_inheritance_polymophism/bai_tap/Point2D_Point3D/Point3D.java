package s06_inheritance_polymophism.bai_tap.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z= 0.0f;

    public Point3D(){
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] array={super.getX(),super.getY(),this.getZ()};
        return array;
    }
    public String toString(){
        return "Array of x, y and z is array = "+ Arrays.toString(this.getXYZ());
    }

}
