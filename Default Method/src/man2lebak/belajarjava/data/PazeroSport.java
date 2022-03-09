package man2lebak.belajarjava.data;

public class PazeroSport implements Car{
    
    public void drive(){
        System.out.println("Pazero Sport 2021");
    }

    public int getTire(){
        return 4;
    }

    public String getBrand(){
        return "Mitsubishi";
    }

    public boolean isMaintenance(){
        return false;
    }

}
