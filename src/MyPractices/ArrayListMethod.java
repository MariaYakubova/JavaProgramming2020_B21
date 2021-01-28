package MyPractices;

import java.util.ArrayList;
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i<=100; i++){
            if(i%2==0){
            }else
                odd.add(i);
        }
        System.out.println(odd);
    }
}
/* Create a method which will return an  Integer ArrayList.
// The method will accept an int array parameter.
 Return every odd number which are in the Array.
*/