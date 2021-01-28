package day18_Srings;

public class SubStringMethod4 {
    public static void main(String[] args) {
        //isEmpty, equals, equalsIgnoreCase, contains, stsrtsWith, endsWith

        String str = "Hello Everyone";
        System.out.println(str.isEmpty() );

        String str2="";
        System.out.println(str2.isEmpty());

        //contains
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("C#") );//false
        System.out.println(sentence.contains(""));
    }
}
