package s12_map.bai_tap.controler;

import s12_map.bai_tap.model.Product;
import s12_map.bai_tap.service.ProductManager;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ProductManager productManager=new ProductManager();
        Product product1=new Product(1,"Iphone 11",20000);
        Product product2=new Product(2,"Iphone 12",26000);
        Product product3=new Product(3,"Iphone 13",31000);
        Product product4=new Product(4,"Iphone 11Pro",21000);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

//        int choose;
//        do {
//            System.out.println("Menu");
//            System.out.println("1. Thêm mới sản phẩm:");
//            System.out.println("2. Xem danh sách Sinh viên:");
//            System.out.println("3. Sửa thông tin Sinh viên:");
//            System.out.println("4. Xoá Sinh viên khỏi danh sách:");
//            System.out.println("6. Tìm kiếm sản phẩm theo tên:");
//            System.out.println("7. Sắp xếp danh sách Sinh viên theo điểm số:");
//            System.out.println("8. EXit");
//
//            System.out.print("Mời bạn chọn chức năng: ");
//            choose = Integer.parseInt(input.nextLine());
//
//
//        } while(choose==8);
    productManager.showAll();
    }

}
