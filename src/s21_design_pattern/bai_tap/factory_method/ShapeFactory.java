package s21_design_pattern.bai_tap.factory_method;

public class ShapeFactory {
    private ShapeFactory(){};
    public static Shape getShape(String shape){
        switch (shape){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new RuntimeException("Loại ngân hàng không tồn tại");
        }
    }
}
