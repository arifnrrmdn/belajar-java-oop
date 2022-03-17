package man2lebak.belajarjava.util;

import man2lebak.belajarjava.error.ValidationException;
import man2lebak.belajarjava.data.LoginRequest;

public class ValidationUtil {
    
    public static void validate(LoginRequest loginrequest) throws ValidationException{
        if(loginrequest.username() == null){
            throw new ValidationException("username tidak boleh null");
        } else if(loginrequest.username().isBlank()){
            throw new ValidationException("usernmae tidak boleh kosong");
        } else if (loginrequest.password() == null){
            throw new ValidationException("password tidak boleh null");
        } else if (loginrequest.password().isBlank()){
            throw new ValidationException("password tidak boleh kosong");
        }
    }

}
