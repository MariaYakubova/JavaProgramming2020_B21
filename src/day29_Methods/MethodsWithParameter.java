package day29_Methods;

public class MethodsWithParameter {
    public static void main(String[] args) {

        int age = 35;

        eligibleToBuyAlcohol(age);
        eligibleToBuyAlcohol(30);

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");



        }
    }
}