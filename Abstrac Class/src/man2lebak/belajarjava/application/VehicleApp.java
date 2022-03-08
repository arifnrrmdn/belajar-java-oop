package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.Car;

public class VehicleApp {
    
    public static void main(String[] args){
    Car car1 = new Car();
    car1.setName("Pazero Sport");
    car1.setTire(4);
    System.out.println(car1.getName());
    System.out.println(car1.getTire());
    car1.display();
    }

}
