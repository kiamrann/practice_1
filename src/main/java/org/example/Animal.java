package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Animal {
    private String name;
    public  Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("Animal is eatting");
    }
    public void bark(){
        System.out.println("Animal is barking");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal{name=" + name + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        return name.equals(((Animal) o).name);
    }

    }


