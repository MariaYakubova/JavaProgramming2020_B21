package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();

        scan.nextLine();//Enter
        System.out.println("Enter your country name: ");
        String countryName = scan.nextLine();//Enter

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); //100000Enter

        scan.nextLine();//Enter
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();//B of AEnter

        System.out.println("Enter your address: ");
        String adress = scan.nextLine();


    }
}
/*
1. ask gender (next() )
2. ask age (nextInt() )
3. ask full name (nextLine() )
4. ask zip code (nextInt() )
5. ask country name (nextLine() )
6. ask salary (nextDouble() )
7. ask  company name(nextLine() )
 */