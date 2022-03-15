package man2lebak.belajarjava.enummember.application;

import man2lebak.belajarjava.enummember.data.Customer;
import man2lebak.belajarjava.enummember.data.Level;

public class App {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setName("Vladmir Putin");
        customer.setLevel(Level.PREMIUM);

        System.out.println("Nama: " + customer.getName());
        System.out.println("Status: " + customer.getLevel());
        
        //memanggil enum member
        System.out.println("Ket: " + customer.getLevel().getDescription() + " Aktif");

    }

}