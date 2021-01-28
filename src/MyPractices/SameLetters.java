package MyPractices;

import java.util.Arrays;

public class SameLetters {
   public static boolean letters(String a, String b){
       //                         anna       aann
       char[] arr1 = a.toCharArray(); // [a,n,n,a]
       char[] arr2 = b.toCharArray(); // [a,a,n,n]

       Arrays.sort(arr1);//[a,a,n,n]
       Arrays.sort(arr2);//[a,a,n,n]

       String word1 = "";//empty pot
       String word2 = "";//empty pot

       for(char each:arr1){ // add one by one a+a+n+n
           word1+=each;
       }
       for(char each:arr2){// add one by one a+a+n+n
           word2+=each;
       }
       return word1.equals(word2);// two words are the same
   }

    public static void main(String[] args) {
        System.out.println(letters("baba", "abba"));
        System.out.println(letters("dddttt", "tttddd"));
    }

}
