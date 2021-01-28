package MyPractices;

import java.util.ArrayList;

    public class ArrayListMethod1{
        public static ArrayList<Integer> ALM(int[] a) { // {3,5,667,9}
            ArrayList<Integer> odd = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 ==1) {
                    odd.add(a[i]);
                }
/* Create a method which will return an  Integer ArrayList.
// The method will accept an int array parameter.
 Return every odd number which are in the Array.
*/
            }
            return odd;
        }
        public static void main(String[] args) {
            int[] a={22,34,5,6,7,8};
            System.out.println(ALM(a));
        }
    }










