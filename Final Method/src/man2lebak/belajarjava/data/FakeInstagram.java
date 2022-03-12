package man2lebak.belajarjava.data;

public class FakeInstagram extends Instagram{
    // error karena mengoveride method yang sudah final
    public void login(String username, String password);
}
