package day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {

        String sentence = "dog dog DogDog cat CAT cAT CAt";
                String temp = sentence.toLowerCase();// after this we do not need to worry case sensetivity
        int countDog = 0;
        String word = "dog";
        while(temp.contains("dog")) {
            temp = temp.replaceFirst(word,"");
            countDog++;
        }
            System.out.println("Number of dogs: countDog"+countDog);

            int countCat = 0;
            while(temp.contains("cat")){
                temp = temp.replaceFirst("cat", "");

            }
        System.out.println("Number of cats: "+countCat);
        }
    }
