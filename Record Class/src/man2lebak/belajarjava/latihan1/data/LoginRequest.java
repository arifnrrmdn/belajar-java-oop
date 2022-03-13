package man2lebak.belajarjava.latihan1.data;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Welcome to System");
    }
    
}
