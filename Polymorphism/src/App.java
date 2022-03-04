public class App {
    public static void main(String[] args) throws Exception {
        //membuat object
        System.out.println("Struktur Jabatan DedSec\n");

        Owner owner = new Owner("Arif Nur Ramadhan", "Owner", "DedSec");
        owner.display();

        owner = new Leader("Aiden Pearce", "Leader", "DedSec");
        owner.display();

        owner = new DataMiner("Sitara Dhawan", "Data Miner", "DedSec");
        owner.display();

    }

}
