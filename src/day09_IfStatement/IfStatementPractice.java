package day09_IfStatement;

public class IfStatementPractice {
    public static void main(String[] args) {

        boolean isPandemic = true;
        if(isPandemic){
            System.out.println("wear mask");
            System.out.println("buy more toilet paper");
            System.out.println("stay at home");
        }

        System.out.println("============");

        String name = "David";
        int age =20;
        boolean  isUsCitizen = false;
        boolean eligible = isUsCitizen && age >= 18;

        if(eligible){
    }
}
}

