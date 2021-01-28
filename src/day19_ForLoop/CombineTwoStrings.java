package day19_ForLoop;

public class CombineTwoStrings {
    public static void main(String[] args) {

        String s1 = "one";
        String s2 = "eight";

        if(s1.charAt(s1.length()-1) == s2.charAt(0)){//if last charactermof first string
            System.out.println(s1+s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }
        System.out.println("==============================");

        if(s1.endsWith(s2.substring(0,1))){
            System.out.println(s1+s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }
    }
}
/*
Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
