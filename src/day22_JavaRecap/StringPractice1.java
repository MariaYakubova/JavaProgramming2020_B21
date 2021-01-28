package day22_JavaRecap;

public class StringPractice1 {
    public static void main(String[] args) {

        String s1 = "https://www.amazon.com"; //.com, .edu, .net, .gov
        String domain = s1.substring(s1.lastIndexOf(".")+1);

        System.out.println(domain);
        String name = s1.substring(s1.indexOf(".")+1, s1.lastIndexOf(".") );
        System.out.println(name);

    }
}
