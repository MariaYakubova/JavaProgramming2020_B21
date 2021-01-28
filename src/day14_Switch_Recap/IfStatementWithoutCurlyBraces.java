package day14_Switch_Recap;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int a = 10;
        if (a % 2 == 0)
            System.out.println("Even Number");
        System.out.println(a + " is even number");
        //without the {}, blocks can containe one statement only

        if (a % 2 == 0)
            System.out.println(a + " is even number");
        else
            System.out.println(a + " is even number");

        System.out.println("==========================");

        int b = 10;
        if (b > 0) {
            System.out.println("Positive");
        } else if (b < 0) System.out.println("Negative");
        else
            System.out.println("Zero");

        System.out.println("============================");

        int number = 5;
        String day = "";

        if (number >= 1 && number <= 7) {

            if (number == 1)
                day = "Mon";
            else if (number == 2)
                day = "Thue";
            else if (number == 3)
                day = "Wed";
            else if (number == 4)
                day = "Thur";
            else if (number == 5)
                day = "Fri";
            else if (number == 6)
                day = "Sat";
            else
                day = "Sun";

            day = "Invalid";
        }

    }

}








