package s15_debug_exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập vào độ dài cạnh 1: ");
            int triangleEdge1 = Integer.parseInt(input.nextLine());
            System.out.print("Nhập vào độ dài cạnh 2: ");
            int triangleEdge2 = Integer.parseInt(input.nextLine());
            System.out.print("Nhập vào độ dài cạnh 3: ");
            int triangleEdge3 = Integer.parseInt(input.nextLine());
            if(triangleEdge1<=0||triangleEdge2<=0||triangleEdge3<=0){
             throw new IllegalTriangleException("Độ dài không được nhỏ hơn 0");
            }
             if((triangleEdge1+triangleEdge2)>triangleEdge3||(triangleEdge1+triangleEdge3)>triangleEdge2||(triangleEdge3+triangleEdge2)>triangleEdge1){
                 throw new IllegalTriangleException("Đây không phải tam giác");
             }
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
}
