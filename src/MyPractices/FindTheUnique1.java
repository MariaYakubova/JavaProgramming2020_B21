package MyPractices;

public class FindTheUnique1 {
    public static String Unique(String str) {
        String result = "";
        for (int i = 0; i <= str.length()-1; i++) {
            int count = 0;
            for (int j = 0; j <= str.length() - 1; j++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }

            }
            if (count == 1) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Unique("yyftgkkk"));
    }
}