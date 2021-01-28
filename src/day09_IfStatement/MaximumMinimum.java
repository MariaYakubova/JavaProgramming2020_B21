package day09_IfStatement;

public class MaximumMinimum {
    public static void main(String[] args) {
        int n1= 200;
        int n2 = 200;

        boolean n1IsMax = n1>n2; // n1 to be the maximum number
        boolean n2IsMax = n2 > n1;// n2 to be the maximum number
        boolean equal = !n1IsMax && !n2IsMax;// n1 is equal to n2
                //n1 == n2
        if(n1IsMax) {
            System.out.println(n1 + "is maximum");
        }
            if(n2IsMax) {
                System.out.println(n2 + "Is maximum");
            }
                if(equal){
                    System.out.println( "Both are equal");
                }

            }
        }


