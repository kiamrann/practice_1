package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cat extends Animal {
    private String breed;
    public Cat(String name,String breed) {
        super(name);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public  String toString(){
        return "Cat{"+super.toString()+"breed="+breed+"}";
    }
}