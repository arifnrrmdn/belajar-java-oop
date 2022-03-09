package man2lebak.application;

import man2lebak.data.PazeroSport;

public class App {
    
    public static void main(String[] args){
        var car1 = new PazeroSport();
        car1.drive();
        System.out.println("Tire: " + car1.getTire());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Maintenance: " + car1.IsMaintenance());
    }

}
