package man2lebak.belajarjava.membuatenum.application;

import man2lebak.belajarjava.membuatenum.data.Customer;
import man2lebak.belajarjava.membuatenum.data.Level;

public class App {
    
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setName("Jokowi");
        customer.setLevel(Level.VIP);
        
        System.out.println("Nama: " + customer.getName());
        System.out.println("Status: " + customer.getLevel());
    }

}
