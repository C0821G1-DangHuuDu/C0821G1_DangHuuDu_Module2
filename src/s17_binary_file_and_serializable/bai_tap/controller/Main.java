package s17_binary_file_and_serializable.bai_tap.controller;

import s17_binary_file_and_serializable.bai_tap.model.Product;
import s17_binary_file_and_serializable.bai_tap.service.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("P001", "Iphone 11","Iphone", 20000.0,"blue");
        Product product2 = new Product("P002", "Iphone 12","Iphone", 21000.0,"red");
        Product product3 = new Product("P003", "Iphone 13","Iphone", 22000.0,"white");
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        Scanner input = new Scanner(System.in);
        int choose;
        do{
            System.out.println("Product Manager:");
            System.out.println("1. Add Product.");
            System.out.println("2. Show Product List.");
            System.out.println("3. Remove Product from code.");
            System.out.println("4. Edit Product from code.");
            System.out.println("5. Exit.");

            System.out.print("Enter your choose: ");
            choose=Integer.parseInt(input.nextLine());
            int index;

            switch (choose){
                case 1:
                    System.out.print("Enter Product Code: ");
                    String addCodeProduct=input.nextLine();
                    System.out.print("Enter Product Name: ");
                    String addNameProduct=input.nextLine();
                    System.out.print("Enter Producer: ");
                    String addProducer=input.nextLine();
                    System.out.print("Enter Price: ");
                    double addPriceProduct=Double.parseDouble(input.nextLine());
                    System.out.print("Enter description: ");
                    String addDescription=input.nextLine();
                    Product product=new Product(addCodeProduct,addNameProduct,addProducer,addPriceProduct,addDescription);
                    productManager.addProduct(product);
                    System.out.println("Add Success!");
                    break;
                case 2:
                    productManager.showAllProduct();
                    break;

                case 3:
                    System.out.print("Enter Product Code to remove: ");
                    String removeCodeProduct=input.nextLine();
                    index=productManager.findIndex(removeCodeProduct);
                    productManager.removeProduct(index);
                    System.out.println("Remove Success!");
                    break;

                case 4:
                    System.out.print("Enter Product Code which you want to edit: ");
                    String editCodeProduct=input.nextLine();
                    index=productManager.findIndex(editCodeProduct);
                    System.out.print("Enter new Product Code: ");
                    String editNewCodeProduct=input.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String editNewNameProduct=input.nextLine();
                    System.out.print("Enter new Producer: ");
                    String editNewProducer=input.nextLine();
                    System.out.print("Enter new Price: ");
                    double editNewPriceProduct=Double.parseDouble(input.nextLine());
                    System.out.print("Enter new description: ");
                    String editNewDescription=input.nextLine();
                    Product productNew=new Product(editNewCodeProduct,editNewNameProduct,editNewProducer,editNewPriceProduct,editNewDescription);
                    productManager.editProduct(productNew,index);
                    System.out.println("Edit Success!");
                    break;

            }
        }while (choose!=5);

    }
}
