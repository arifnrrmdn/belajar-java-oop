package man2lebak.belajarjava.util;

import man2lebak.belajarjava.data.LoginRequest;
import man2lebak.belajarjava.error.BlankException;

public class ValidationRuntime {
    public static void ValidationRuntime(LoginRequest loginrequest) {
        if(loginrequest.username() == null){
            throw new NullPointerException("username tidak boleh null");
        } else if(loginrequest.username().isBlank()){
            throw new BlankException("username tidak boleh kosong");
        } else if(loginrequest.password() == null){
            throw new NullPointerException("password tidak boleh null");
        } else if(loginrequest.password().isBlank()){
            throw new BlankException("password tidak boleh kosong");
        }
    }
}
