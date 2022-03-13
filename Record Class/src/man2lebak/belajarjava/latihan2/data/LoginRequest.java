package man2lebak.belajarjava.latihan2.data;

public record LoginRequest(String username, String password) {
    
    public LoginRequest{
        System.out.println("Constructor Utama dipanggil");
    }

    // public LoginRequest(String username){
    //     this(username, "");
    // }
    
    public LoginRequest(String password){
        this("", password);
    }

    public LoginRequest(){
        this("","");
    }

}
