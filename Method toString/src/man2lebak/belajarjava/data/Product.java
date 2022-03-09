package man2lebak.belajarjava.data;

public class Product {
    String name;
    int price;

    //constructor
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product name: " + name + ", price: " + price;
    }
}
