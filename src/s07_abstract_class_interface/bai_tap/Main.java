package s07_abstract_class_interface.bai_tap;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3.0);
        shapes[1]=new Rectangle(3.0,5.0);
        shapes[2]=new Square(6.0);

        System.out.println("Trước thay đổi:");
        for (Shape shape: shapes){
            System.out.println(shape);
        }

        double percen=(Math.random()*100)/100;
        System.out.println(percen);

//        ((Circle) shapes[0]).resize(percen);
//        ((Rectangle) shapes[1]).resize(percen);
//        ((Square) shapes[2]).resize(percen);
//Cóc cách nào vừa duyệt mảng vừa gọi phương thức không?
        System.out.println("Sau thay đổi:");
        for (Shape shape: shapes){

            if (shape instanceof Circle){
                ((Circle) shape).resize(percen);
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(percen);
            }else if (shape instanceof Square){
                ((Square) shape).resize(percen);
            }
            System.out.println(shape);

            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }

    }
}

//            if (shape instanceof Square){
//              ((Square) shapes[2]).howToColor(); // chỗ này làm sao biết được index là 2. Có cách nào khác để gọi phương thức chỗ này không?