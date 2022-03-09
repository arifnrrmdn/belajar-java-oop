package man2lebak.data;

public class PazeroSport implements Car{
    
    public void drive(){
        System.out.println("Pazero Sport");
    }

    public int getTire(){
        return 4;
    }

    public String getBrand(){
        return "Mitsubishi";
    }

    public boolean IsMaintenance(){
        return true;
    }

}
