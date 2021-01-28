package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

                String name1 ="Azad";
                String name2 ="Ayse";
                String name3 ="Inna";
                String name4 ="Erjon";
                String name5 ="Aysel";

        String[]names = {"Azad" , "Ayse" , "Inna" , "Erjon" , "Aysel"};
        //index num :       0        1        2         3         4
        // retrive data from array :
        System.out.println(names[2]);

        String str1 = names[0];
        System.out.println(str1);

        int[ ]score = {80, 85, 90, 70,75};
        // index :      0   1   2   3  4

        //Erjon: 70
        System.out.println(names[3]+":"+score[3]);
        System.out.println(names[1]+":"+score[1]);
        System.out.println(names[2]+":"+score[2]);
        System.out.println(names[4]+":"+score[4]);

//                 i<4 is the same with i<= 9-1
        for(int i=0; i < names.length-1; i++){
            System.out.println(names[i]+":"+ score[i]);
        }

    }
}
