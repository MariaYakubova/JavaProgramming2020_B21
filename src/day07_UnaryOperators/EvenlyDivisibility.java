package day07_UnaryOperators;

public class EvenlyDivisibility {
    public static void main(String[] args) {

        int number = 65;

        int remainder0f2 = number % 2;
        boolean divisibleBy2 = remainder0f2 < 1;

        int reminder0f3 = number % 3;
        boolean divisibleBy3 = reminder0f3 < 1;
        //                       2 < 1

        int reminder0f5 = number % 5; //0
        boolean divisibleBy5 = reminder0f5 < 1;
        //                       0 < 1


        System.out.println(number + " is divisible by 2: "+divisibleBy2);
        System.out.println(number + " is divisible by 3: "+divisibleBy3);
        System.out.println(number + " is divisible by 5: "+divisibleBy5);

        // < 1

    }
}
/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
Unary Operators:
        -: negative
        +: positive (implicit)
        --:
        ++:

 */