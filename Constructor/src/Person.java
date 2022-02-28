class Person{
    String name;
    String country;

    Person(String paramName, String paramCountry){
        name = paramName;
        country = paramCountry;
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", my name is " + name);
    }

}