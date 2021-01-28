package MyPractices;

public class ReverseString1 {

    public static String Muhtar(String a) {

        String b = "";
        for(int i=a.length()-1; i>=0;i--){
            b+=a.toCharArray()[i];

        }

         return b;
    }

    public static void main(String[] args) {
        System.out.println(Muhtar("Killer of mine brain"));
    }
}

