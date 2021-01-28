package day21_WhileLoop;

public class SubStringMethodPractice {
    public static void main(String[] args) {
        String email = "John_Daniel@BOfA.com";

int indexOf_ = email.indexOf("_");
int indexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0, indexOf_ );
        String firstName = email.substring(indexOf_+1);
        String domain = email.substring(indexOfAt+1,email.lastIndexOf("."));

        String fullName = lastName+" "+firstName;
        System.out.println("lastName = "+lastName);
        System.out.println("firstName= "+firstName);
        System.out.println("domain= "+domain);
        System.out.println("fullName="+fullName);
    }
}
//lastName_firstName@companyName.com