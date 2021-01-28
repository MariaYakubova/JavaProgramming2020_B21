package day09_IfStatement;

public class EligibleToBuyAlcohol2 {
    public static void main(String[] args) {

        int age = 20;
        boolean eligible = age >= 21;
        // false

        if (eligible) {
            System.out.println("You are eligible to buy alcohol");
        }
        if(!eligible){
            System.out.println("Go buy your milk");
        }
        System.out.println("===========================");
        boolean isBreakTime = true;

        if(isBreakTime){
            System.out.println("Time to take a break");

        }
    }
}
