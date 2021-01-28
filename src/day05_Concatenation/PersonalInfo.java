package day05_Concatenation;

public class PersonalInfo {

    public static void main(String[] args) {
        String firstName = "Maria";
        String lastName = "Yakubova";
        String fullName = firstName+" "+lastName;
        int age = 38;
        String gender ="Female";
        int phoneNumber = 847650311;
        int SSN = 444111222;

        System.out.println("Full Name is: "+ fullName);
        System.out.println("Age is: " + age + " years old");
        System.out.println("Gender is: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("SSN: " + SSN);
    }
}
