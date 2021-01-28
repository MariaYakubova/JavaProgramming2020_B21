package MyPractices;

public class FindMax {
    public static int Max(int[] array) {//{2,3,4,5}
        int max1 = array[0];
        for (int element : array) {//{2,3,4,5}
            if (max1 < element) {
                max1 = element;
            }

        }
        return max1;
    }

    public static void main(String[] args) {
        int[] array = {5,6,7,82,-4};
        System.out.println(Max(array));
    }
}