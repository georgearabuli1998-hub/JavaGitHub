package org.example;

public class ForInterFaces implements  InterFace, InterFace2,InterFace3{
    @Override
    public void printName(String name, int age){

            System.out.println("ჩემს ძაღლს ჰვია " + name + " , რომელიც არის  " + age + " წლის .");
    }
    @Override
    public void printFood (String food){
        System.out.println("მისი საყვარელი საჭმელია " + food + ".");
    }
    @Override
    public void sound(String sound){
        System.out.println("გამოსცემს "   + sound + " -ის მაგვარ ხმას");
    }

};
