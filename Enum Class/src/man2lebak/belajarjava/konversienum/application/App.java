package man2lebak.belajarjava.konversienum.application;

import man2lebak.belajarjava.enummember.data.Customer;
import man2lebak.belajarjava.enummember.data.Level;

public class App {
    
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setName("Iif Ramadhan");
        customer.setLevel(Level.STANDARD);

        System.out.println("Name: " + customer.getName());
        System.out.println("Status: " + customer.getLevel().getDescription());

        //konversi enum ke string
        String leveltoString = Level.PREMIUM.name();
        System.out.println(leveltoString);

        //konversi string ke enum
        Level level = Level.valueOf("VIP");
        System.out.println(level);

        //menampilkan semua opsi enum
        System.out.println("Menampilkan opsi enum");
        for(var value : Level.values()){
            System.out.println(value);
        }

    }

}
