public class App {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.name = "Aiden Pearce";
        leader.showPosition();
        System.out.println("Name: " + leader.name + "\n");

        // BotHeader botHeader = new BotHeader();
        // botHeader.name = "Marcus Holloway";
        // botHeader.showPosition();
        // System.out.println("Name: " + botHeader.name);

        BotHeader botHeader = (BotHeader) leader;
        // botHeader.name = "Marcus Holloway";
        botHeader.showPosition();
        System.out.println("Name: " + botHeader.name);
    }
}
