package s12_map.bai_tap.controler;

import s12_map.bai_tap.model.Product;
import s12_map.bai_tap.service.ProductManager;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1, "Iphone 11", 20000);
        Product product2 = new Product(2, "Iphone 12", 26000);
        Product product3 = new Product(3, "Iphone 13", 31000);
        Product product4 = new Product(4, "Iphone 11Pro", 21000);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm mới sản phẩm:");
            System.out.println("2. Xem danh sách sản phẩm:");
            System.out.println("3. Sửa thông tin sản phẩm:");
            System.out.println("4. Xoá sản phẩm khỏi danh sách:");
            System.out.println("5. Tìm kiếm sản phẩm theo tên:");
            System.out.println("6. Sắp xếp danh sách sản phẩm theo giá:");
            System.out.println("7. EXit");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = input.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    int price = Integer.parseInt(input.nextLine());
                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    productManager.showAll();
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int idNeedFix = Integer.parseInt(input.nextLine());
                    int indexFix = -1;
                    indexFix = productManager.findProductId(idNeedFix);
                    if (indexFix == -1) {
                        System.out.println("ID not found");
                        break;
                    } else {
                        System.out.print("Nhập ID sản phẩm: ");
                        int idFix = Integer.parseInt(input.nextLine());
                        System.out.print("Nhập tên sản phẩm: ");
                        String nameFix = input.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        int priceFix = Integer.parseInt(input.nextLine());
                        Product productFix = new Product(idFix, nameFix, priceFix);
                        productManager.editProduct(idNeedFix, productFix);
                        break;
                    }
                case 4:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int idNeedRemove = Integer.parseInt(input.nextLine());
                    int indexRemove = -1;
                    indexRemove = productManager.findProductId(idNeedRemove);
                    if (indexRemove == -1) {
                        System.out.println("ID not found");
                        break;
                    } else {
                        productManager.removeProduct(indexRemove);
                        break;
                    }
                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
                    String nameFind = input.nextLine();
                    productManager.findProductName(nameFind);
                case 6:
                    productManager.sortProduct();
                    break;
            }
        } while (choose != 7);
    }
}
