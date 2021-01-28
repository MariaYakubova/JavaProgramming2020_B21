package MyPractices;

public class FindMin {
    public static int Min(int[]array){

        int min = array [0];
        for(int element:array){
            if (min>element){
                min=element;
            }
        }



        return min;
    }

    public static void main(String[] args) {
        int[]array = {23,45,0,10,-6};
        System.out.println(Min(array));
    }
}
