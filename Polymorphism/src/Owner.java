public class Owner {
    
    String name;
    String position;
    String company;
    //constructor
    Owner(String name, String position, String company){
        this.name = name;
        this.position = position;
        this.company = company;
    }
    //display
    void display(){
        System.out.println("Name: " + this.name + ", Position: " + this.position);
        System.out.println("Company: " + this.company + "\n");
    }

}
