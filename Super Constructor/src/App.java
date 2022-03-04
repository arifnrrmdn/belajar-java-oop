public class App {
    public static void main(String[] args){
        //membuat objek
        var leader = new Leader("Aiden Pearce", "DedSec", "Leader");
        var botheader = new BotHeader("Marcus Holloway", "DedSec", "Bot Header");
        var intrusionspecialist = new IntrusionSpecialist("Wrench", "DedSec", "Intrusion Specialist");
        var dataminer = new DataMiner("Sitara Dhawan", "DedSec", "Data Miner");
        var moneyspecialist = new MoneySpecialist("Raymond Kenney", "DedSec", "Money Specialist");

        //display
        leader.display();
        botheader.display();
        intrusionspecialist.display();
        dataminer.display();
        moneyspecialist.display();

        
    }
}
