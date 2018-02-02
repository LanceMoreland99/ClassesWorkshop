package com.company;

import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesToWalk;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesToWalk, boolean canFetch, String coatType ){
        super( ownerName,  petName, homeAddress,  age,  gender);

        this.likesToWalk = likesToWalk;
        this.canFetch = canFetch;

    }



    public boolean isLikesToWalk() {
        return likesToWalk;
    }

    public void setLikesToWalk(boolean likesToWalk) {
        this.likesToWalk = likesToWalk;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    public int humanYear(int humanYear) {
        return (humanYear * 7);
    }

    //    public Dog() {
//        System.out.println("what is your dogs name?");
//        setPetName(input.nextLine());
//        System.out.println("does " + getPetName() + " like to take walks? true or false?");
//        setLikesToWalk(input.nextBoolean());
//
//
//    System.out.println("what is your dogs name?");



    protected String doesPetMakeSound(){
        return super.doesPetMakeSound() + " " + "but dogs bark.";

    }
}
