package org.example;

public abstract class AbstracticClasAndMethods {
    int age;
    String name;

    abstract void print(String name, int age); // abstraqtuli მეთოდი ამაზე მეტად აქ არ იუწერება, შვილ კლასებში ვუკეთებთ ოვერრაიდინგს
     static void nonAbstract(String name){
        System.out.println("შენ ხარ  "+ name);
    };
}
