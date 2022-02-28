//membuat field
class Person{
    String name;  //ini adalah field
    String country;  //ini adalah field
}

public class App {
    public static void main(String[] args) {
        
        var person1 = new Person();
        person1.name = "Arif Nur Ramadhan";
        person1.country = "Indonesia";

        System.out.println(person1.name);
        System.out.println(person1.country);
    }
}
