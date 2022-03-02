class Person{
    String name;
    String address;
    final String Country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;       
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name + " from " + this.address + ", " + this.Country);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Arif", "Bandung");
        person1.sayHello("Budi");
        Person person2 = new Person("Racquel", "Yogyakarta");
        person2.sayHello("Budi");
    }
}
