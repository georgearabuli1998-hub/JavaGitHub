package org.example;

abstract class  AbstracticClass {
    abstract void countStudent(String name, int age, int price);
    public void nonAbstractMethod(int count,int ages){
        if(ages < 18 || ages > 65){
            System.out.println("სამწუხაროდ ვერ დარეგისტრირდებით რადგან თქვენ ხართ "  + ages + " წლის");
        }else {

            if (count > 5 && count < 20) {
                System.out.println("კურსზე ჯერ მხოლოდ " + count + " მოსწავლეა დარეგისტრირებული, ამიტომ დაველოდოთ ცოტახანს, სანამ 20 არ გახდება.");
            } else if (count >= 20 && count <= 50) {
                System.out.println("კურსზე უკვე " + count + " მოსწავლეა დარეგისტრირებული და შეგვიძლია დავიწყოთ სწავლება.");
            } else if (count > 50) {
                System.out.println("კურსი შეივსო და გადააჭარბა კიდეც მაქსიმალური ადგილების რაოდენობას " + (count - 50) + " ით.");
            } else {
                System.out.println(count + " მოსწავლის გამო არ ღირს კურსის დაწყება, დიდი შანსია გაუქმდეს.");
            }
        }
    }
}
