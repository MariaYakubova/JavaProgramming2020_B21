package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {

        String name="Daniel";
        boolean isUSACitizen = false;
        int age = 25;
        boolean hasCriminalBackground = true;

        boolean isEligible =  isUSACitizen == true && age >=18 &&hasCriminalBackground == false ;
                                // true=true && 25 >= 18 && true ==false
                                // true  &&  true && false
                                // false

        System.out.println(name+"is eligible to vote: " +isEligible);

        String name2 = "John";
        String c1 = "China";
        String c2 = "USA";

        boolean eligible = c1 == "USA"  ||  c2 == "USA";
        //              China == USA    // "Canada" = "USA"
        //           false              || false
        // true

        System.out.println(name+"is eligible to vote :" +eligible);




    }
}
