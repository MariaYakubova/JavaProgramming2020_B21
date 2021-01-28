package MyPractices;

import java.util.ArrayList;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    public class task3_2_MKL {
        public static Integer maxNum(ArrayList<Integer> num){
            int max=Integer.MIN_VALUE;
            for(Integer each:num){
                if(each>max){
                    max=each;
                }
            }
            return max;
        }
        public static Integer secondL(int[] arr){
            ArrayList<Integer> list=new ArrayList<>();

            for(int each:arr) {
                list.add(each);
            }
            int a=maxNum(list);

            list.removeIf(p -> p==a);


            return maxNum(list);
        }


    }

