public class App {
    public static void main(String[] args) throws Exception {
        //manager
        Manager manager = new Manager();
        manager.name = "Zed";
        manager.sayHello("Budi");

        //vicepresident
        VicePresident vPresident = new VicePresident();
        vPresident.name = "Arif";
        vPresident.sayHello("Budi");
    }
}
