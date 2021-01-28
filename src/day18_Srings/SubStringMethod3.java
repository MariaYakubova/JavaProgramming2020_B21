package day18_Srings;

public class SubStringMethod3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";
        sentence=sentence.replace("Java", "Pyton");//Pyton is fun, Pyton is cool
        System.out.println(sentence);

        String email = "masha@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String essay = "Batch 20 is cool,Batch 20 is good ";
       essay= essay.replace("20", "21");
        System.out.println(essay);

        System.out.println("=======================");

        String a = "Yesterday was Monday, Today is Monday, Tommorow is gonna be Monday";
        //Yesterday was Sunday, Today is Monday, Tommorow is gonna be Tuesday

        a = a.replaceFirst("Monday", "Sunday");
        a = a.replaceFirst(" be Monday", "be Tuesday");
        System.out.println(a);

        System.out.println("===============================");

        String emailAddress = "Cybertek_School@gmail.com";
        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingIndex = emailAddress.indexOf(".com");

        String domain = emailAddress.substring(beginningIndex, endingIndex);
        System.out.println(domain);


        String p = "I like to Watch movies and reading books";
        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        String name = "My name is Muhtar";
        String result = name.substring(name.lastIndexOf("M"));





    }
}
