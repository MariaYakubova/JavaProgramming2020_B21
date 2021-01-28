package day25_ArrayIntro;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] students = new String[5];
        students [0] = "Agalar";
        students [1] = "Alice";
        students [2] = "Alla";
        students [3] = "Avrora";

        for(int i = 0; i< students.length;i++)
            System.out.println(students[i]);

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
        System.out.println(students[5]);

    }
}
