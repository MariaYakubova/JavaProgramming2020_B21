package day15_Scanner;
import java.util.Scanner;

public class Scanner_EvenOrOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int number = in.nextInt();

        if(number %2==0) {
            System.out.println(number + "is even");
        }else{
            System.out.println(number + "is odd");
        }

    }

}
