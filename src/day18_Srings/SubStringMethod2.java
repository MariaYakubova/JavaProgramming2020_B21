package day18_Srings;
import java.util.Scanner;
public class SubStringMethod2 {
    public static void main(String[] args) {
        String str ="Today is Monday";
        //           0123456789
        String day1 = str.substring(9);
        System.out.println(day1);
        System.out.println("=====================");
Scanner scan = new Scanner(System.in);
        String firstName = "cyBErTeK";//Cybertek
        firstName = firstName.substring(0,1).toUpperCase() +firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        System.out.println("Last Name:");
        String lastName = scan.next();

       // lastName = lastName.substring()
    }
}
