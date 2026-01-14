package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Second {
    public static void main(String[] args) {
        hello();
        integer();
    }

    private static void integer() {
        for(int i=-128;i<=127;i++){
            Integer first = i;
            Integer second = i;
            System.out.println(i);
            System.out.println(first==second);
            System.out.println(first.equals(second));
        }
    }
    private static void hello() {
        String a = new String("string");
        String b = new String("string");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }

}