package java8WithSelenium.com.udemy.java.polymorphism;

import learning.access_Modifier.p2.D;

public class TestMain {
    public static void main(String[] args) {

        /*AreaCalculator a = new AreaCalculator();
        System.out.println(a.getArea(24));
        System.out.println(a.getArea(4.5f));*/


        //Dog c = new Dog();
        //Cat c = new Cat();
        //Horse c = new Horse();

        Animal a = new Dog();
        test(a);
        a = new Cat();
        test(a);
        a = new Horse();
        test(a);


    }

    private static void test(Animal animal){
        animal.makeSound();
        animal.walk();
    }
}
