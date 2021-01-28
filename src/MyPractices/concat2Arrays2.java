package MyPractices;

import java.util.Arrays;

public class concat2Arrays2 {
    public static int[]Concat2Arrays(int[] arr1, int[] arr2){
        int[] twoarr = new int[arr1.length+arr2.length];
        int i =0;
         for(int each:arr1){
             twoarr[i]=each;
             i++;

         }
        for(int each:arr2) {
            twoarr[i] = each;
            i++;

        }

        return twoarr;
    }

    public static void main(String[] args) {
        int[]arr1={4,6,7};
        int[]arr2 ={9,0,8};
        System.out.println(Arrays.toString(Concat2Arrays(arr1, arr2)));
    }
}
