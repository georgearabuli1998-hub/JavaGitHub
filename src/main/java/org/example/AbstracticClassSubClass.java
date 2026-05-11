package org.example;

public class AbstracticClassSubClass extends AbstracticClass{
    int age;
    public String name;
    private int price;

public  int settPrice(int price){
    this.price = price;
    return price;
}

    @Override
    void countStudent(String name, int age, int price) {

        System.out.println("იმისათვის, რომ " + name + " კურსზე დარეგისტრირდეთ, საჭიროა, რომ მოსწავლის მინიმალური ასაკი იყოს " + age + " და გადახდილი ჰქონდეს " + price + " ლარი");
    }

    @Override
    public void nonAbstractMethod(int count, int ages) {
        super.nonAbstractMethod(count,ages);
    }
}
