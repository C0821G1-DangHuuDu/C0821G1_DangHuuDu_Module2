package s17_binary_file_and_serializable.bai_tap.service;

import s17_binary_file_and_serializable.bai_tap.model.Product;

public interface IProductManager {
    public void addProduct(Product product);
    public void showAllProduct();
    public void removeProduct(int index);
    public void editProduct(Product product,int index);
    public int findIndex(String code);

}
