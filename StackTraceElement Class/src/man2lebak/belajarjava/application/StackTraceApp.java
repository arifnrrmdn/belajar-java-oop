package man2lebak.belajarjava.application;

public class StackTraceApp {
    
    public static void main(String[] args){
        
        try{
            String[] names = {
                "Arif", "Nur", "Ramadhan"
            };

            System.out.println(names[100]);

        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }

}
