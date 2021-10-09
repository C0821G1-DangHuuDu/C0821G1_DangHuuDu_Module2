package review.information_vehicle;

public class Vehicle {

    private String name;
    private String model;
    private double volume;
    private int price;
    private double tax;

    public Vehicle(){


    }

    public Vehicle(String name, String model, double volume, int price) {
        this.name = name;
        this.model = model;
        this.volume = volume;
        this.price = price;
        this.tax=this.registrationTax();

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return this.registrationTax();
    }

        public double registrationTax(){
        double tax;
        if(this.getVolume()<100){
            tax=price*0.01;
        }else if (this.getVolume()<200){
            tax=price*0.03;
        }else {
            tax=price*0.05;
        }
        return tax;
    }

    public String toString(){
        return "Name Vehicle: "+this.getName()+"\n Model: "+this.getModel()+
                "\n Volume: "+this.getVolume()+"\n Price: "+this.getPrice()+
                "\n Registration Tax: "+this.getTax();
    }
}
