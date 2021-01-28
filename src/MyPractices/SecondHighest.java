package MyPractices;
public class SecondHighest {
    public static void main(String args[]) {
        int[] array = {0, 12, 74, 26, 82, 3, 89, 8, 94, 3};

        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > secondHighest)

                secondHighest = array[i];
        }

                System.out.println("second largest is "+secondHighest);
            }
        }

/*Create a method which will return an integer (return type).
 This method will have an int array parameter.
Return the number from that array which is a second highest num.

 */

