package man2lebak.belajarjava.data;

public class Car extends Vehicles{
    
    //getter
    public String getName(){
        return name;
    }

    public int getTire(){
        return tire;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setTire(int tire){
        this.tire = tire;
    }

    //display
    public void display(){
        System.out.println("Mobil: " + name);
        System.out.println("Jumlah Roda: " + tire);
    }
}
