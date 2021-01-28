package day27_ForEachLoop;

public class ThreeFirstCharacters {
    public static void main(String[] args) {
        String[] names={ "Erjon", "Katrin", "Aamir", "Lola", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};

        for( String eachName : names ){
            System.out.println( eachName.substring(0, 3 ) );
        }

    }
}
