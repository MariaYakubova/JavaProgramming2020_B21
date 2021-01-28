package MyPractices;

public class FindTheUnique2 {
    public static String Unique1(String str){
        String num="";
        for(int j=0; j<=str.length()-1; j++) {


            int freq = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    freq++;

                }

            }
            if (freq == 1) {
                num += str.charAt(j);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Unique1("1122334456780"));
    }
}
