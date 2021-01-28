package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {
        String firstName = "Maria "; //"" for the text
        String lastName = "Yakubova ";
        String fullName = firstName+" "+lastName;
        char gender = 'F'; //'' for single characters
        int age = 35;
        String companyName = " Capital One";
        String jobTitle = "SDET";
        double salary = 120000;//120000.0
        boolean isFullTime = false;
        boolean isMarried = true;

        System.out.println("Employee' full name is:"+fullName);
        System.out.println(fullName +"' gender is: "+gender );
        System.out.println(fullName+"' age is: "+age+" years old");
        System.out.println(fullName+" works at" + companyName );
        System.out.println(fullName+"'s job titile is: "+jobTitle );
        System.out.println( fullName+"'s salary is: $ " + salary );

        System.out.println();
        /*
        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

         write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
         */
    }
}
