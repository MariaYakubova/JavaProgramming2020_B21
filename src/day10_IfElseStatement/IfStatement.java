package day10_IfElseStatement;

public class IfStatement {
    public static void main(String[] args) {
        int score = 45;
        if (score >= 60) {
            System.out.println("Congrats");

        }
        if(score<60){
            System.out.println("Keep trying");
        }
        System.out.println("=======================");

        if(score>=60){
            System.out.println("Congrats");
        }else{
            System.out.println("Keep Trying");

            System.out.println("========================");

            int angle1 = 80;
            int angle2 = 75;
            int angle3 = 65;
            int angle4 = 75;

            boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
                                        //false
            // if each of the angles are equal to 90, then it's valid

            if(isValidRectangle){
                System.out.println("It is valid rectangle");
            }
            if(!isValidRectangle){
                System.out.println("It is Not valid rectangle");
            }
            if(isValidRectangle){
                System.out.println("The rectangle is valid");

            }else{
                System.out.println("The rectangle is Not +valid");

                System.out.println("===================");

                // assume that a&b are 2 different numbers
                int a = 1000000;
                int b = 202020;
                int max = 0; //?
                System.out.println("Maximum number is :"+max);


                //what is the maximum number
                if(a>b){
                    max = a;
                }else{
                    max = b;
                }
                System.out.println("Maximum number is :"+max);

            }

        }
    }
}
