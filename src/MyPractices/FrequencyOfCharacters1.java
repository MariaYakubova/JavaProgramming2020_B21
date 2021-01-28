package MyPractices;

public class FrequencyOfCharacters1 {
    public static String FrequencyOfChars(String str) {

        String expectedResult = "";

        while (!str.isEmpty()) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(0)) {

                    count++;

                }

            }

            expectedResult += str.charAt(0) + "" + count;

            str = str.replace("" + str.charAt(0), "");

        }

        return expectedResult;

    }
}