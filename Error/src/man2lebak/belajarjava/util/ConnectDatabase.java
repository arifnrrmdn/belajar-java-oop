package man2lebak.belajarjava.util;

import man2lebak.belajarjava.error.DatabaseError;

public class ConnectDatabase {
    public static void ConnectDatabase(String username, String password){
        //jika salah satu null maka error
        if(username == null || password == null){
            throw new DatabaseError("tidak bisa konek ke data base");
        }
    }
}
