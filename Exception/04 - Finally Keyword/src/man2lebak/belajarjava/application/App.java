package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.error.ValidationException;
import man2lebak.belajarjava.util.ValidationUtil;

public class App {
    
    public static void main(String[] args){
        LoginRequest loginrequest = new LoginRequest("iif","12345");
        System.out.println(loginrequest);
        try{
            ValidationUtil.validate(loginrequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("data tidak valid");
            System.out.println("Warning!! tampil error dengan pesan : " + e.getMessage());
            // finally keyword error atau tidak tetap dijalankan
        } finally {
            System.out.println("Created iif ramadhan");
        }
    }

}
