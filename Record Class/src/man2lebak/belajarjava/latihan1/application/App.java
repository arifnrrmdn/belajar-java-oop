package man2lebak.belajarjava.latihan1.application;

import man2lebak.belajarjava.latihan1.data.LoginRequest;

public class App {

    public static void main(String[] args){

        LoginRequest loginrequest = new LoginRequest("Arif Nur Ramadhan", "12345678");
        
        System.out.println(loginrequest.username());
        System.out.println(loginrequest.password());

        System.out.println(loginrequest);
    }

}