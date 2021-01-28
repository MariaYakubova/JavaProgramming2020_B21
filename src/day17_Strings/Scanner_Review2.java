package day17_Strings;
import java.util.Scanner;
public class Scanner_Review2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String product = input.nextLine();

        System.out.println(product);

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();//We have to hit enter to submit the information
        input.nextLine();// the enter from the above method will be absorbed

        System.out.println("Enter their full name");
        String fullName = input.nextLine();

        System.out.println(fullName+" your order for"+ quantity +" " +product +" has been placed. Your total is"+(price));

        System.out.println(product);
        System.out.println(price);







    }
}
