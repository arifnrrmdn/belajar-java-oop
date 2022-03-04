public class App {
    public static void main(String[] args) throws Exception {
        //membuat object
        var object1 = new Leader("Aiden", "Leader", "");
        // leader.display();
        var object2 = new IntrusionSpecialist("Wrench", "DedSec", "Intrusion Specialist");
        // intrusionspecialist.display();
       
        System.out.println(object1);
        System.out.println(object1.toString());
        System.out.println(object2);
        System.out.println(object2.toString());
        
    }
}
