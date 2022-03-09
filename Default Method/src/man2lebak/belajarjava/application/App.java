package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.PazeroSport;
import man2lebak.belajarjava.data.Bus;

public class App {
    public static void main(String[] args){
        var pazerosport = new PazeroSport();
        pazerosport.drive();
        System.out.println("Tire: " + pazerosport.getTire());
        System.out.println("Brand: " + pazerosport.getBrand());
        System.out.println("Maintenance: " + pazerosport.isMaintenance());
        System.out.println("Big: " + pazerosport.isBig() + "\n");
        
        var bus = new Bus();
        bus.drive();
        System.out.println("Tire: " + bus.getTire());
        System.out.println("Brand: " + bus.getBrand());
        System.out.println("Maintenance: " + bus.isMaintenance());
        System.out.println("Big: " + bus.isBig());
    }
}