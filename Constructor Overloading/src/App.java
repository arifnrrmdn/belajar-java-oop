public class App {
    public static void main(String[] args){
        //membuat object
        Person person1 = new Person("Arif", "Indonesia");
        Person person2 = new Person("Arif");
        Person person3 = new Person(); 

        //display
        person1.sayHello("Budi");
        person2.sayHello("Budi");
        person3.sayHello("Budi");
    }
}
