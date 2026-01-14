package org.example;

    public class Main {
        public static void main(String[] args) {

            Dog d1 = new Dog("Rex", "Bulldog");
            Dog d2 = new Dog("Rex", "Bulldog");
            Animal a=new Dog("Rex", "Bulldog");
            Feeder.feed(a);

            System.out.println(d1 == d2);
            System.out.println(d1.equals(d2));
        }
    }
