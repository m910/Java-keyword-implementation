package com.stackroute;

import org.w3c.dom.ls.LSOutput;

class Animal {
    void eats() {
        System.out.println("Eating");
    }

    void walks() {
        System.out.println("walking");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }

}

public class ExampleForInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eats();
        dog.walks();
    }


}
