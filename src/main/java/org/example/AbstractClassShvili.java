package org.example;

class AbstractClassShvili extends AbstracticClasAndMethods{
int legs= 4;
    @Override // ოვერაიდინგი ამით ხდება
    void print(String name,int age) {
        System.out.println("შენ გყავს " + name + "რომელიც არის " + age + " წლის და აქვს " + this.legs + " ფეხი"); //მშობელში სხვა ფუნქცია ჰქონდა აქ სხვა გავუკეთე, პროსტა პარამეტრები ერთნაირები უნდა ჰქონდთ
    }


}
