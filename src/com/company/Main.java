package com.company;

public class Main {

//    private String myString;
//
//    protected String lotsOfStrings;
//
//    public String lastString;
//
//    String anotherString; // this string can be seen by Data





    public static void main(String[] args) {
        Dog dog = new Dog( "lance", "storm", "100 Wallaby", 4, 'm', true, true, "long");

        Cat cat = new Cat("lance","John", "wallaby way", 10, 'm',true, true, "long" );


        System.out.println(dog.doesPetMakeSound());

        System.out.println(cat.humanYear(12));

        System.out.println(dog.humanYear(9));
    }

}
