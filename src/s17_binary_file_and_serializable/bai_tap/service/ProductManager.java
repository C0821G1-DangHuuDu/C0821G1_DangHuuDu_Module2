package s17_binary_file_and_serializable.bai_tap.service;

import s17_binary_file_and_serializable.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements IProductManager, Serializable {
    List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }
    public void add(Product product) {
        productList.add(product);
    }


    @Override
    public void addProduct(Product product) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s17_binary_file_and_serializable\\bai_tap\\service\\productList.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            this.productList.add(product);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showAllProduct() {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s17_binary_file_and_serializable\\bai_tap\\service\\productList.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList= (List<Product>) objectInputStream.readObject();
            for (Product product:productList){
                System.out.println(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeProduct(int index) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s17_binary_file_and_serializable\\bai_tap\\service\\productList.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            this.productList.remove(index);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editProduct(Product product,int index) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\s17_binary_file_and_serializable\\bai_tap\\service\\productList.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            this.productList.set(index,product);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int findIndex(String code) {
        int index=-1;

        index=productList.indexOf(new Product(code));
//        for (int i=0;i<productList.size();i++){
//        if (productList.get(i).getCode().equals(code)){
//            index = i;
//        }else {
//            try {
//                throw new Exception("Not found Code in product list!");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        }
        return index;
    }

}



