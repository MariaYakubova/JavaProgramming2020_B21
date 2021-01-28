package day09_IfStatement;

public class EligbleToVote {
    public static void main(String[] args) {
        String name ="John";
        String citizen ="USA";
        boolean eligible = citizen == "USA";

        System.out.println(name +"is eligible to vote for Donald Tramp or Joe Biden?\n\t"+eligible);
        System.out.println("=================================");


        String name2 = "Aaron";
        boolean isUSACitizen = false;//
        boolean eligibleToVote = isUSACitizen ==true;
        //                       false   ==   true
                                        //  false




    }
}
/*
write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
Collapse




 */