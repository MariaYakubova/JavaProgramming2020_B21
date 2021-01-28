package MyPractices;

import day20_ForLoop.StringReverse;

public class ReverseString3 {

    public static String StrReverse(String str){
        String reverse="";
        for(int i =str.length()-1; i>=0; i--)
           reverse +=str.toCharArray()[i];

       return reverse;
    }

    public static void main(String[] args) {
        String d = "Masha";
        System.out.println(StrReverse(d));
    }
}
