package MyPractices;

public class FindMax1 {
    public static int Max1(int[]array){
        int max = Integer.MIN_VALUE;
        for(int element: array){
            if(max<element){
                max = element;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[]array ={0,-100,100};
        System.out.println(Max1(array));
    }
}
