package s06_inheritance_polymophism.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", false, 5.8);
        System.out.println(square);
    }
}
