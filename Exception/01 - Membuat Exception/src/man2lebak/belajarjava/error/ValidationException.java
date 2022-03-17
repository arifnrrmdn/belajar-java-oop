package man2lebak.belajarjava.error;

public class ValidationException extends Throwable{

    private String messsage;

    public ValidationException(String message){
        super(message);
    }

}