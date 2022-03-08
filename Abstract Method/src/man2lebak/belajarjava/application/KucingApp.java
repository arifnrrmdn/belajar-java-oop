package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.Leo;

public class KucingApp {
    
    public static void main(String[] args){
        Leo leo = new Leo();
        leo.setName("leo");
        System.out.println("Name: " + leo.name);
        leo.lapar();
    }

}
