public class App {
    public static void main(String[] args) throws Exception {
        // Leader leader = new Leader("Aiden Pearce");
        // leader = new BotHeader("Marcus Holloway");
        // leader = new DataMiner("Sitara Dhawan");
        // leader = new IntrusionSpecialist("Wrench");
        // leader = new MoneySpecialist("Raymond Kenny");

        display(new Leader("Aiden Pearce"));
        display(new BotHeader("Marcus Holloway"));
        display(new IntrusionSpecialist("Wrench"));
        display(new Coders("Josh Sauchak"));
        display(new DataMiner("Sitara Dhawan"));
        display(new MoneySpecialist("Raymond Kenny"));
    }

    static void display(Leader leader){
        if(leader instanceof BotHeader){
            BotHeader botHeader = (BotHeader) leader;
            System.out.println("Bot Header: " + botHeader.name);
        }else if(leader instanceof DataMiner){
            DataMiner dataMiner = (DataMiner) leader;
            System.out.println("Data Miner: " + dataMiner.name);
        }else if(leader instanceof IntrusionSpecialist){
            IntrusionSpecialist intrusionSpecialist = (IntrusionSpecialist) leader;
            System.out.println("Intrusion Specialist: " + intrusionSpecialist.name);
        }else if(leader instanceof MoneySpecialist){
            MoneySpecialist moneySpecialist = (MoneySpecialist) leader;
            System.out.println("Money Specialist: " + moneySpecialist.name);
        }else if(leader instanceof Coders){
            Coders coders = (Coders) leader;
            System.out.println("Coders: " + coders.name);
        }
        else {
            System.out.println("Leader: " + leader.name);
        }
    }
}
