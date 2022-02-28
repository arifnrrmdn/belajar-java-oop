public class Person {
    String name;
    String country;
    
    //constructor
    Person(String paramName, String paramCountry){
        name = paramName;
        country = paramCountry;
    }

    Person(String paramName){
        name = paramName;
    }

    Person(){

    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
