package MyPractices.Unit4;

import java.util.Arrays;

public class SameLetters1 {
    public static boolean Words(String a, String b){

        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String word1 = "";
        String word2 = "";

        for(char each : arr1){
            word1+=each;
        }
        for(char each : arr2){
            word2+=each;
        }
        return word1.equals(word2);
    }

    public static void main(String[] args) {
        System.out.println(Words("west", "loft"));
    }
}
