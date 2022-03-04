public class Leader {
    String name;
    String company;
    String position;
    //constructor
    Leader(String name, String position, String company){
        this.name = name;
        this.position = position;
        this.company = company;
    }
    //display
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Company: " + this.company + "\n");
    }
}
