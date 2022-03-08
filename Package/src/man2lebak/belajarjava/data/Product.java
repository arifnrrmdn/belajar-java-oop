package man2lebak.belajarjava.data;

public class Product {
    private String name = "iphone 8 Plus";
    int price;

    void display(){
        System.out.println("Product: " + name);
    }
}

class test {
    public static void main(String[] args) {
        Product product1 = new Product();
        //product1.name = "iPhone 8 Plus"; // error
        //System.out.println(product1.name); // error
        product1.display();
    }
}

