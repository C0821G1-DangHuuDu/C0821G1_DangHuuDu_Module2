package s17_binary_file_and_serializable.bai_tap.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String code;
    private String name;
    private String producer;
    private double price;
    private String description;

    public Product() {
    }

    public Product(String code) {
        this.code = code;
    }

    public Product(String code, String name, String producer, double price, String description) {
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }


}
