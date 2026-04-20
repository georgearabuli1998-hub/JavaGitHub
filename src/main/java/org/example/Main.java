package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String clientName = "გიორგი";
        boolean vipUser = true;
        boolean textMassage;
        int choosedfloor = 11;
        int blockedFloor = 10;
        int currentFloor =0 ;
        int currentWeight = 100;
        boolean canMove = false;
        boolean doorPosition = true;

        if (choosedfloor == currentFloor) {
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". ჩვენ უკვე " + currentFloor + " სართულზე ვიმყოფებით");
        }else if(choosedfloor <= -5  && vipUser == false){
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". გთხოვთ აირჩიოთ ვალიდური სართული");
        }
        else if (choosedfloor >=20  && vipUser == false) {
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". გთხოვთ აირჩიოთ ვალიდური სართული");
        }else if(choosedfloor <-7  && vipUser == true){
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". გთხოვთ აირჩიოთ ვალიდური სართული");

        } else if(choosedfloor >50  && vipUser == true){
            doorPosition = false;
            canMove = false;
            System.out.println("მოგესალმებით, " + clientName + ". გთხოვთ აირჩიოთ ვალიდური სართული");

        }else if (choosedfloor == blockedFloor) {
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". მოცემულ სართულზე მიმდინარეობს ტექნიკური სამუშაოები");
        } else if (currentWeight > 400) {
            doorPosition = false;
            canMove = false;
            choosedfloor = currentFloor;
            System.out.println("მოგესალმებით, " + clientName + ". ფიქსირდება წონის გადაჭარბება");
        }else {
            canMove = true;
        }
        if(canMove == true){
            currentFloor = choosedfloor;
            doorPosition=true;
            System.out.println("მოგესალმებით, " + clientName + ". დავიძარით მოთხოვნილი სართულისკენ");
        }
        System.out.println(doorPosition);
        System.out.println(choosedfloor);
        System.out.println(canMove);
    }

}
