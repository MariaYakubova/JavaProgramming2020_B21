package MyPractices;

public class EvenOrOdd {
    public static String EvenOrOdd(int n){
        String result = "";
        if(n%2==0) {
            result = "even";
        }else{
            result = "odd";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(EvenOrOdd(7));
    }
}
