package MyPractices;

public class SecondHighestMethod {

    public static int getSecondHighest(int arr[]) {
        int firstHighest = arr[0];
        int secondHighest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = {13,56,34,0};
        System.out.println(getSecondHighest(arr));
    }
}






/*Create a method which will return an integer (return type).
 This method will have an int array parameter.
Return the number from that array which is a second highest num.

 */
