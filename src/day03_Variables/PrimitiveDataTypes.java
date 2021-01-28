package day03_Variables;
/*
declare variables:
       DataType name = Data;
 */

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        //score is 85
        double score = 85;
        System.out.println(score);
        System.out.println("score");

        long number0 = 999999999; // int is prefered, complier takes it as an int, and the number 9999999999 is outnof int' range
        long umber1 = 9999999999L;

        double decimal1 = 0.5;
       // float float1 = 0.5; // double is prefered for decimals, compiler takes it as double' range is greater than
        float float2 =0.5f;

        System.out.println(float2);//0,5

    }

}
