package s06_inheritance_polymophism.bai_tap.Point_MoveablePoint;

public class MoveAblePointTest {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint1=new MoveAblePoint();
        System.out.println(moveAblePoint1);

        MoveAblePoint moveAblePoint2=new MoveAblePoint(3.3f,4.4f);
        System.out.println(moveAblePoint2);

        MoveAblePoint moveAblePoint3=new MoveAblePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(moveAblePoint3);

        moveAblePoint3.move();
        System.out.println(moveAblePoint3);

    }

}
