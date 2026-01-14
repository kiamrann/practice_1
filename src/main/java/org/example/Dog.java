package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dog extends Animal {
    private String breed;
    public Dog(String name,String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return "Dog{"+super.toString()+"breed="+breed+"}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;
        return breed.equals(dog.breed);
    }
}