package day12_Nestedlf;

public class EqualityOfNumbers {
    public static void main(String[] args) {
        int n1 =100 ;
        int n2 =200 ;
        int n3 =100 ;

        String result ="";
        if(n1==n2 && n2==n3) {//becomes if not all of them are equal
            result = "all equal";
        }else if(n1==n2){
            result = "n1&n2 are equal";
        }else if(n2==n3) {
            result = "n2&n3 are equal";
        }else if (n1==n3){
            result = "n1&n3 are equal";
        }else{
            result="none of are equal";
        }
        System.out.println(result);
        //String result2 = (n1==n2 && n2==n3)?"all equal":(n1==n2)?"n1&n2 are equal"



    }
}
