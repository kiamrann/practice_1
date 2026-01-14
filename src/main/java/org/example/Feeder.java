package org.example;

class Feeder {

    static void feed(Animal animal) {
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // безпечний downcast
            dog.bark();
        }
    }
}
