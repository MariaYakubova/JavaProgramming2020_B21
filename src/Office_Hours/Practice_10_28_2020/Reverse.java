package Office_Hours.Practice_10_28_2020;

public class Reverse {
    public static void main(String[] args) {
        String name    ="Cyber";
        //               01234
        String result ="";//"rebyc"
        /*result+= name.charAt(name.length()-1);
        result += name.charAt(3);
        result += name.charAt(2);
        result += name.charAt(1);
        result += name.charAt(0);
*/

        for(int i = name.length()-1; i>=0;i--){
            result += name.charAt(i);

        }
        System.out.println(result);

    }
}
