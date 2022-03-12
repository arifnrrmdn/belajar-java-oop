package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.HelloWorld;

public class App {
    
    public static void main(String[] args){

        HelloWorld english = new HelloWorld() {
            
            public void sayHello(){
                System.out.println("Hello World");
            }

            public void sayHello(String name){
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            
            public void sayHello(){
                System.out.println("Halo Dunia");
            }

            public void sayHello(String name){
                System.out.println("Halo " + name);
            }
        };

        System.out.println("english:");
        english.sayHello();
        english.sayHello("Arif");
        System.out.println("indo:");
        indonesia.sayHello();
        indonesia.sayHello("Arif");


    }

}

