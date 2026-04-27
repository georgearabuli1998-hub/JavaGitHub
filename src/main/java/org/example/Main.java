package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {


        // პირველი  საშინაო დავალება   27.04.2026

        // დავალება   1    while ციკლის გამოყენებით გამოიტანეთ ეკრანზე 3 -ზე გამრავლების
        //ტაბულა (1 - 10 ჩათვლით). "3*7=21" ასეთი სახით

        int i = 0;
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int namravli;
        while (i < numberList.length) {
            namravli = numberList[i] * 3;
            i++;
            System.out.println(i + " *  3 = " + namravli);
        }

        //დავალებები გამოვყავი ერთმანეთისგან დაბლა
        System.out.println();//დავალებები გამოვყავი დაბლა

        // დავალება 2     შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი
        //წინადადება და შეამოწმეთ, თუ ამ წინადადების სიგრძე იქნება ლუწი რიცხვი,
        //დაბეჭდეთ :"ლუწი", თუ კენტი მაშინ: "კენტი"

        String textName = "1234";
        if (textName.length() % 2 == 0) {
            System.out.println("ლუწია ამ წინადადების სიგრძე");
        } else {
            System.out.println("კენტია ამ წინადადების სიგრძე");
        };

        //დავალებები გამოვყავი ერთმანეთისგან დაბლა
        System.out.println();//დავალებები გამოვყავი დაბლა

        // დავალება  3   for -ით დაბეჭდეთ მასივში არსებულ ყოველი ელემენტი, გარდა მეხუთე
        //პოზიციაზე მდგომისა

        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int j;
        int textForShowing = 0;
        for (j = 0; j < listOfNumbers.length; j++) {
            if (j == 4) {
                continue;
            } else {
                textForShowing = listOfNumbers[j];
                System.out.println(textForShowing);
            };
        };


        //დავალებები გამოვყავი ერთმანეთისგან დაბლა
        System.out.println();//დავალებები გამოვყავი დაბლა


        // დავალება  4    შემოიტანე ნებისმიერი სტრინგი და for -ით დათვალე ამ სტრინგში რამდენი
        //ხმოვანი არის
        String textFor4 = "ააეეიიოოუუბბბბ   ი";
        char[] xmovnebi = {'ა', 'ე', 'ი', 'ო', 'უ'};
        int aeiou = 0;

        for (int x = 0; x < textFor4.length(); x++) {
            char chars = textFor4.charAt(x);
            for (int y = 0; y < xmovnebi.length; y++) {
                if (xmovnebi[y] == chars) {
                    aeiou = aeiou + 1;
                } else {
                    continue;
                };
            };
        };
        System.out.println(aeiou);


        //დავალებები გამოვყავი ერთმანეთისგან დაბლა
        System.out.println();//დავალებები გამოვყავი დაბლა

        // დავალება  5    შემოიტანე ნებისმიერი სტრინგი და while -ით დათვალე ამ სტრინგში
        //რამდენი თანხმოვანი არის

        String textFor5 = "ტატუ ,.";
        int a = 0;
        int tanxmovnebisRaodenoba = 0;
        while (a < textFor5.length()) {
            char charss = textFor5.charAt(a);
            int b = 0;
            boolean xmovania = false;
            while (b < xmovnebi.length) {

                if (xmovnebi[b] == charss || charss == ' ') {
                    xmovania = true;
                    break;

                } else if (charss == ',' || charss == '.') {
                    xmovania = true;
                    break;
                };
                b++;

            };
            if (!xmovania) {
                tanxmovnebisRaodenoba++;
            };
            a++;
        };
        System.out.println(tanxmovnebisRaodenoba);















    /*    // ლიფტის პროექტი, ლიფტის მხრიდან.
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

*/

        // ავტომატიზაციის საშინაო დავალებები

        // 1 .while ციკლის გამოყენებით გამოიტანეთ ეკრანზე 3 -ზე გამრავლების
        //ტაბულა (1 - 10 ჩათვლით). "3*7=21" ასეთი სახით

        /* int i = 1;

        while(i<=10){
            System.out.println( i + " * 3 = " + i * 3);
            i++;
        };


        //ეს მიწერია დაბლა პასუხებში ადგილის გამოსატოვებლად დავალებებს შუა
        System.out.println("") ;


        //შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი
        //წინადადება და შეამოწმეთ, თუ ამ წინადადების სიგრძე იქნება ლუწი რიცხვი,
        //დაბეჭდეთ :"ლუწი", თუ კენტი მაშინ: "კენტი"

        String text = "რეგრესიული ტესტირება დავასრულე, თუმცა ლაივი გადაიდო ზოგიერთი პროექტის გამო ";
        int textLength = text.length();
        if(textLength % 2 == 0){
    System.out.println(" ამ წინადადების სიგრძე არის ლუწი რიცხვი");
        }else{
    System.out.println("ამ წინადადების სიგრძე არის კენტი რიცხვი");
        };


        //ეს მიწერია დაბლა პასუხებში ადგილის გამოსატოვებლად დავალებებს შუა
        System.out.println("") ;


        //3  for -ით დაბეჭდეთ მასივში არსებულ ყოველი ელემენტი, გარდა მეხუთე
        //პოზიციაზე მდგომისა
        int[] numberList = {1,4,5,6,10,5,67,8,2,43,565,3,5};
        int s;
        for(s = 0; s <numberList.length; s++){
            if(s == 4) {
                continue;
            }
                System.out.println(numberList[s]) ;
        };

        //ეს მიწერია დაბლა პასუხებში ადგილის გამოსატოვებლად დავალებებს შუა
        System.out.println("") ;



        //4  შემოიტანე ნებისმიერი სტრინგი და for -ით დათვალე ამ სტრინგში რამდენი
        //ხმოვანი არის
        String secondText = "გოგო";
        int xmovnebisRaodenba = 0;

     for(char letter : secondText.toCharArray()){
        if (letter == 'ა'){
            xmovnebisRaodenba ++;
        };
        if (letter =='ე'){
            xmovnebisRaodenba ++;
        };
        if (letter == 'ი'){
            xmovnebisRaodenba ++;
        };
        if (letter == 'ო') {
            xmovnebisRaodenba++;
        };
        if (letter == 'u') {
            xmovnebisRaodenba++;
        };

        };
        System.out.println("ტექსტში არის " + xmovnebisRaodenba + " ხმოვანი");


        //4 მეორენაირი ამოხსნა
        char[] xmovnebi = {'ა','ე','ი','ო','უ'};
        int t;
        int x;
        int raodenoba = 0;
        for(t=0; t<secondText.length();t++){
            char letters = secondText.charAt(t);
            for (x=0;x<xmovnebi.length;x++){
                if(letters == xmovnebi[x]){
                    raodenoba++;
                };
            };
        };
System.out.println("მეორე ვარიანტის მიხედვით, ნესთედ for-ის გამოყენებითაც ხმოვნების რაოდენობაა  " + raodenoba);



        int[] cifrebi = {101,200,30,40,55,67,71,90};
        int max = 101;
        int[] axmas={};
        int i;
        for(i=0;i<cifrebi.length; i++){

              cifrebi[i] = cifrebi[i] * 2;
            System.out.println(cifrebi[i]);
        }

*/

        // პირველი  საშინაო დავალება   27.04.2026

        // დავალება   1    while ციკლის გამოყენებით გამოიტანეთ ეკრანზე 3 -ზე გამრავლების
        //ტაბულა (1 - 10 ჩათვლით). "3*7=21" ასეთი სახით
    };
    };