package org.example;

public class AnimalChild extends Animal{

@Override  public void makeSound() {
    System.out.println("in child's opinion, dog is not burking at this time"); // აქ გავუკეთე ოვერრაიდინგი
}
@Override public  void eat(){
    System.out.println("at this time, dog is not eating"); // ეს უბრალოდ წავივარჯიშე და დავამატე
}
}
