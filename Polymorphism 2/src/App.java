import javax.swing.text.Position;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sturktur Organisasi DedSec\n");
        //membuat objek
        // Owner object = new Owner("Arif Nur Ramadhan", "Owner", "DedSec");
        // object.display();
        // object = new Leader("Aiden Pearce", "Leader", "DedSec");
        // object.display();
        // object = new BotHeader("Marcus Holloway", "Bot Header", "DedSec");
        // object.display();
        // object = new DataMiner("Sitara Dhawan", "Data Miner", "DedSec");
        // object.display();

        display(new Owner("Arif Nur Ramadhan", "Owner", "DedSec"));
        display(new Leader("Aiden Pearce", "Leader", "DedSec"));
        display(new BotHeader("Marcus Holloway", "Bot Header", "DedSec"));
        display(new DataMiner("Shitara Dhawan", "Data Miner", "DedSec"));
    }

    static void display(Owner object){
        System.out.println("Name: " + object.name + ", Position: " + object.position);
        System.out.println("Company: " + object.company);
    }
}
