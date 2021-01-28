package MyPractices;

import java.util.Arrays;

public class concat2Arrays {
    public static int[] concat2Arrays(int[] arr1, int[] arr2){
        int [] result = new int[arr1.length+arr2.length];
        int i = 0;
        for(int each:arr1){
             result[i]=each;
             i++;
        }
        for(int each:arr2){
            result[i]=each;
            i++;
        }



        return result;
    }

    public static void main(String[] args) {
        int[]arr1={12,34,56};
        int[]arr2={90,0,9};
        System.out.println((Arrays.toString(concat2Arrays(arr1, arr2))));
    }
}
