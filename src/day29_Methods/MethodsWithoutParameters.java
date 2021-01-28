package day29_Methods;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Masha");
        printHello5Times();
        System.out.println("School name");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();

        System.out.println("Odd Numbers: ");
        MethodsWithoutParameters2.printOddNumbers1To100();

    }
    // AccessModifier  specifier   returnTYPE   MethodName (Parameter)
public static void printHello5Times(){
    for(int i=1; i<6; i++){

        System.out.println("Hello");
    }
}
}
/*
Methods: function, grouping a series of code fragments
        step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)
 */