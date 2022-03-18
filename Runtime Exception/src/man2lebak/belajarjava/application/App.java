package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.error.BlankException;
import man2lebak.belajarjava.util.ValidationRuntime;

public class App {

    public static void main(String[] args){
        LoginRequest loginrequest = new LoginRequest("", "12345678");
        System.out.println(loginrequest);
        try{
            ValidationRuntime.ValidationRuntime(loginrequest);
            System.out.println("data valid");
        } catch (BlankException e){
            System.out.println("data tidak valid");
            System.out.println("pesan error : " + e.getMessage());
        }
        
    }
}