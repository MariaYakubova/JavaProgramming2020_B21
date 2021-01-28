package MyPractices;

import java.util.ArrayList;
import java.util.Collections;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class task3_MKL {

        public static int findMax(int[] arr){

            int max=Integer.MIN_VALUE;
for(int each:arr){
                if(each>max){
                    max=each;
                }
            }
            return max;
        }
        public static Integer secondLarge(int[] arr){
            int max=findMax(arr);

            ArrayList<Integer> list = new ArrayList<>();

            for(int each: arr) {
                if(each==max){
                    continue;

                }
                list.add(each);
            }

            return Collections.max(list);
        }

        public static void main(String[] args) {
            int[] arr={2,3,4,5,6,7,8,67,789};
            System.out.println(secondLarge(arr));
        }
    }

