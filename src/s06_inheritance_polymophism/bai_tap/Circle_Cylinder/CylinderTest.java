package s06_inheritance_polymophism.bai_tap.Circle_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1=new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2=new Cylinder(5.0);
        System.out.println(cylinder2);

        Cylinder cylinder3=new Cylinder(3.0,"red", 6.0);
        System.out.println(cylinder3);

        double volume1=cylinder1.getVolume();
        System.out.println(volume1);

        double volume2=cylinder2.getVolume();
        System.out.println(volume2);

        double volume3=cylinder3.getVolume();
        System.out.println(volume3);


    }
}
