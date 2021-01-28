package MyPractices;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters3 {
    public static String FreqOFChar(String str){
        String result = "";
        ArrayList<String> list=new ArrayList<>();//
        for(String each:str.split("") ){
            list.add(each);
        }
for(String element:list){
    if(!result.contains(element) ){
        result+=element+ Collections.frequency(list,element);
    }
}

        return result;
    }

    public static void main(String[] args) {
        System.out.println(FreqOFChar("wncd"));
    }
}
