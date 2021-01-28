package MyPractices;

import java.util.Arrays;

public class SameLetters1 {
    public static boolean Names(String a, String b) {

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String name1 = "";
        String name2 = "";

        for (char each : arr1) {
            name1 += each;
        }
        for (char each : arr2) {
            name2 += each;


        }
        return name1.equals(name2);
    }

    public static void main(String[] args) {
        System.out.println(Names("nina", "inna"));
    }
}