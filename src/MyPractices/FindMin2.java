package MyPractices;

public class FindMin2 {
    public static int Min2(int[] array){
        int min = Integer.MAX_VALUE;
        for( int element:array){
            if(min>element){
                min=element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = {-9,-8,-7,};
        System.out.println(Min2(array));
    }
}
