package MyPractices;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class sumOfDigits1 {
    public static int SumOfNumbers1(String str){
        int total =0;
        ArrayList<Character>list= new ArrayList<>();
        for(Character each : str.toCharArray()){
            if(Character.isDigit(each)){
                total+=Integer.valueOf(""+ each);
            }
        }
            return total;
            }

    public static void main(String[] args) {
        System.out.println(SumOfNumbers1("dhy3457@#$90"));
    }
        }


