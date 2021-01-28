package MyPractices;

import java.util.ArrayList;

public class sumOfDigits {
    public static int SumOfNumbers(String str) {
        int result = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (Character each : str.toCharArray()) {//bwue34 b,w,
            if (Character.isDigit(each)) {
                result += Integer.valueOf("" + each);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumbers("sd3456$%^45"));
    }
}