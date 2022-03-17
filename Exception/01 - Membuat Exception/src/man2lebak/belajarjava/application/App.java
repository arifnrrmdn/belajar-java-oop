package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.error.ValidationException;
import man2lebak.belajarjava.util.ValidationUtil;

public class App {
    
    public static void main(String[] args){
        LoginRequest loginrequest = new LoginRequest("iif", "1234");
        try{
            ValidationUtil.validate(loginrequest);
            System.out.println("data valid");
        } catch (ValidationException e) {
            System.out.println("data tidak valid");
            System.out.println("Terjadi error dengan pesan : " + e.getMessage());
        }
    }

}
