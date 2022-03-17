package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.exception.Validationexception;
import man2lebak.belajarjava.util.ValidationUtil;

public class App {
    public static void main(String[] args){
        LoginRequest loginrequest = new LoginRequest("iif", "");

        try {
            ValidationUtil.validate(loginrequest);
            System.out.println("Data Valid");
        } catch (Validationexception pesan){
            System.out.println("Data tidak valid : " + pesan.getMessage());
            // multiple try catch
        } catch (NullPointerException pesan){
            System.out.println("Data null");
        }

    }
}
