package man2lebak.belajarjava.latihan2.application;

import man2lebak.belajarjava.latihan2.data.LoginRequest;

public class App {

    public static void main(String[] args){
        LoginRequest loginrequest = new LoginRequest();
        // System.out.println(loginrequest);

        System.out.println(new LoginRequest("arif123", "123456578"));
        System.out.println(new LoginRequest("arif"));
        System.out.println(new LoginRequest());
    }
    
}
