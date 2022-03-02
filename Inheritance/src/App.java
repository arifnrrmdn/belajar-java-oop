public class App {
    public static void main(String[] args) throws Exception {
        //membuat objek
        Manager manager = new Manager();
        manager.name = "Arif";
        manager.sayHello("Budi");

        VicePresident vicepresident = new VicePresident();
        vicepresident.name = "Sandhika";
        vicepresident.sayHello("Budi");

    }
}
