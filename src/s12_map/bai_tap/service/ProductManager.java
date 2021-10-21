package s12_map.bai_tap.service;

import s12_map.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int index) {
        if (index < 0 || index > productList.size()) {
            System.out.println("Index not correct");
        } else {
            productList.remove(index);
        }
    }

    public void showAll() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void sortProduct() {
        Collections.sort(productList);
    }

    public void findProductName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
                break;
            } else {
                System.out.println("Not found Product " + name);
            }
        }
    }

    public int findProductId(int id) {
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return index;
    }

    public void editProduct(int id, Product product) {
        int index = findProductId(id);
        productList.set(index, product);

    }

}
