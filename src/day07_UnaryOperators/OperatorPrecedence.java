package day07_UnaryOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {

        int x = 2+3 *2/1;
        // 2+3/1
        // 2+6=8

        System.out.println(x);
        int  y = ( 2+3)*2;
        // 2+6=8

        int z = 2+3*2;
        // 2+6=8

        System.out.println(y);
        System.out.println(z);

        int w = 78/2*2+3-5%5;

        System.out.println(w);

        int t = 8+2+3+5-2-1-0+1*2;
        //

        System.out.println(t);

    }

}
