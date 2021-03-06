package day31_MethodOverLoading;

public class Frequency0fWord {
    public static void main(String[] args) {
        String str = "Today is great day, today we are learning java, today we have java class";
        int count = frequencyOfWord(str, "today");

        System.out.println(count);

    }


    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }

        return frequency;

    }


}
/*
Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3

 */