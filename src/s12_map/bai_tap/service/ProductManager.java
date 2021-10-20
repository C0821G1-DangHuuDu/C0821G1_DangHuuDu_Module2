package s12_map.bai_tap.service;

import s12_map.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList;
    public ProductManager (){
        productList=new ArrayList<>();
    }
    public ProductManager (List<Product> productList){
        this.productList=productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(int index){
        if(index<0||index>productList.size()){
            System.out.println("Index not correct");
        }else{
            productList.remove(index);
        }
    }
    public void showAll(){
        for(Product product:productList){
            System.out.println(product);
        }
    }

}
