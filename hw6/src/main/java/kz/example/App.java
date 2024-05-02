package kz.example;


import kz.example.animals.Cat;
import kz.example.animals.Dog;

public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello Animals!" );
        Cat cat1 = new Cat(5,200);
        Dog dog1 = new Dog(1,460,70);

        cat1.jump(4);
        cat1.run(300);
        cat1.swim(12);

        dog1.jump(4);
        dog1.run(400);
        dog1.swim(12);

    }
}
