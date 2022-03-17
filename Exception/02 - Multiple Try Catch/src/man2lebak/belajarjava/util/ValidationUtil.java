package man2lebak.belajarjava.util;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.exception.Validationexception;

public class ValidationUtil {

    public static void validate(LoginRequest loginrequest) throws Validationexception, NullPointerException{
        if(loginrequest.username() == null) {
            throw new NullPointerException("username tidak boleh nulll");
        } else if(loginrequest.username().isBlank()) {
            throw new Validationexception("username tidak boleh kosong");
        } else if(loginrequest.password() == null) {
            throw new NullPointerException("password tidak boleh null");
        } else if(loginrequest.password().isBlank()) {
            throw new Validationexception("password tidak boleh kosong");
        } 
    }

    
}
