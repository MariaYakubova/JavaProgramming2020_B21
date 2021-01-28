package day18_Srings;
import java.util.Scanner;
public class StringPractices2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); //mAC book
        product = product.replace(" ", "").toLowerCase();//macbook
        switch (product){
            case "macbook":
                System.out.println("Which model MacBook would like?");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook Pro is $2500");
                }else{




          //  case "iphone":

           // case"ipad":

           // default:
                System.err.println("Invalid Product Name");
        }
        }

    }
}
/*
MacBook:      mAC book
air:2400
pro:2500
Iphone:
12: 1000
11: 900
10: 800
8: 700

Ipad:
air: 500
mini:400
pro:300
 */
