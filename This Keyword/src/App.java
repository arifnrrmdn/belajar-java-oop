class  Person{
    String name;
    String address;
    final String country = "Indonesia";
    //constructor
    //this untuk variable
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    void sayHello(){
        //this untuk method
        this.sayHello("Budi");
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name + " from " + this.address + ", " + this.country);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        //membuat object
        Person person1 = new Person("Arif", "Bandung");
        Person person2 = new Person("Onno", "Jakarta");
        person1.sayHello();
        person2.sayHello();
    }
}
