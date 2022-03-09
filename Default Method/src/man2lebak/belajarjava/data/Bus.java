package man2lebak.belajarjava.data;

public class Bus implements Car{
    
    public void drive(){
        System.out.println("Bus MGI");
    }

    public int getTire(){
        return 6;
    }

    public String getBrand(){
        return "HINO";
    }

    public boolean isMaintenance(){
        return true;
    }

    public boolean isBig(){
        return true;
    }

}
