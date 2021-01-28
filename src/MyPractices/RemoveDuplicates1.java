package MyPractices;

public class RemoveDuplicates1 {
    public static String RemoveDup2(String RemoveDup2){
        String dup = "";
        for(String each:RemoveDup2.split("")){
            if(!dup.contains(each)){
                dup+=each;
            }
        }

        return dup;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDup2("11223344"));
    }
}
