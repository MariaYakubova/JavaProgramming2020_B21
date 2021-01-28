package MyPractices;

public class RemoveDuplicates {
    public static String RemoveDup(String Letters) {
        String result = "";
        for (String each : Letters.split("")) {
            if (!result.contains(each)) {
                result += each;


            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDup("aaabbbmmm"));
    }
}
