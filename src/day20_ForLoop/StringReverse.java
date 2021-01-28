package day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str ="ABCD";
        //           0123

        String result = ""; // we want to contain the expected result which is the revered version of str
        //"cba"
//                          3
        for(int i = str.length()-1 ; i>=0; i--){//i: 3,2
            result+=str.charAt(i);//D
        }
        System.out.println("result = " + result);
    }
}
