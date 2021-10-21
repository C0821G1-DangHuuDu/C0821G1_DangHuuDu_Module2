package s12_map.bai_tap.model;

public class Product implements Comparable {
    private int id;
    private String  name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o.equals(null)||!(o instanceof Product)){
            return 0;
        }
        Product product= (Product) o;
        if(this.getPrice()>product.getPrice()){
            return 1;
        }else if (this.getPrice()<product.getPrice()){
            return -1;
        }else {
            return 0;
        }

    }
}
