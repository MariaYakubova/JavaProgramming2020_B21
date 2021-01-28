package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " ");
        }
        System.out.println("======================");


        for (int i = 100; i <= 200; i++) {
            System.out.println(i);

            System.out.println("=====================");

            //1 3 5 7 9 11.....

            for (int i1 = 1; i1 <= 100; i1 += 2) {
                System.out.println(i1 + " ");

                System.out.println();

                System.out.println("========================");
                //0 2 4 6 8 .....100
                for (int i2 = 0; i2 <= 100; i2 += 2) {
                    System.out.println(i2 + " ");

                    for (int i3 = 1; i3 <= 5; i3++) {
                        System.out.println("Push Up" + i3);


                    }
                }
            }
        }
    }
}
