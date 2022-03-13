package man2lebak.belajarjava.data;

public class Computer {
    
    public static final int PROCESSOR;

    //semua yang berada di block static akan ditampilkan
    static {
        System.out.println("Mengakses jumlah processor");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

}
