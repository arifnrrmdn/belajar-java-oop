public class Leader {
    String name;
    String company;
    String position;

    //constructor
    Leader(String name, String company, String position){
        this.name = name;
        this.company = company;
        this.position = position;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is " + this.name + " position leader");
    }

    //display
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Company: " + this.company);
        System.out.println("Position: " + this.position + "\n");
    }
}
