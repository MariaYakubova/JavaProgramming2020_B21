package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        /*
        Scanner object:1
        min: 1
        "Enter a num":5
        scan.nextInt(:5
        comparing: 5

        "Minimum number is : ..":1
        */
        Scanner scan = new Scanner(System.in);
        int min = 234567890;
        // user is most likely to enter a number that's smaller than 234567890

        for(int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();
            if(n<min){
                min = n;

            }

        }
        System.out.println("min="+min);
    }
}
