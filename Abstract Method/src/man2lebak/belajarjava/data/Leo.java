package man2lebak.belajarjava.data;

public class Leo extends Kucing{
    
    //setter
    public void setName(String name){
        this.name = name;
    }

    public void lapar(){
        System.out.println("Meong meong...");
    }

    public void tidur(){
        System.out.println("krook krook...");
    }

    public void makanIkan(){
        System.out.println("Krauk krauk...");
    }

    //display
    public void display(){
        System.out.println("Suara kucing beserta artinya");
    }
}
