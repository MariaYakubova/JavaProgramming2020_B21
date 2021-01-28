package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="AAAAAAAABBBBBBBBCCCCCDDDDDEEEEEFFFF";//A,A,A,B,B etc
        String result = "";//"ABCDEF"

        for(int i = 0; i<=str.length()-1;i++){
            String eachCharacter =""+ str.charAt(i);//A,A,A,B,B,C etc
            if(result.contains(eachCharacter)) {
                continue;
            }else{//if the character of str is not contained in the result yet,
                // then we concate the character
               result += eachCharacter;
            }
        }
        System.out.println("result=" +result);



        }
    }

