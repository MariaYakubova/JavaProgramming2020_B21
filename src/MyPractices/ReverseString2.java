package MyPractices;

public class ReverseString2 {
    public static String StrReverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)


            reverse += str.toCharArray()[i];
        return reverse;
    }

    public static void main(String[] args) {
String i= "Good";

        System.out.println(StrReverse(i));

    }
}

