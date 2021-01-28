package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {
        int a = 10000;
        int b = 200;

        int max1 = 0;
        if(a>b){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println("Max number in If:"+max1);

        int max2 = (a>b) ? a:b;
        System.out.println("Max number in Ternary:"+max2);

        System.out.println("========================");
        int min1 = 0;
        if(a<b){
            min1 = a;
        }else{
            min1 = b;
        }
        System.out.println("Minimum number in if : "+min1);

        int min2 =(a<b) ? a :b ;
        System.out.println("Minimum number in Ternary;"+min2);
    }
}
