package Office_Hours.Practice_11_04_2020;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

        String str = "aaabcde";
        //            0123456
        char ch ='a';
        int frequency = 0;
        for (int i = 0; i<= str.length()-1;i++){
            if(ch == str.charAt(i)){
                frequency++;

            }
        }
        System.out.println(frequency);
    }
}