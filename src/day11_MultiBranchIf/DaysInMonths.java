package day11_MultiBranchIf;

public class DaysInMonths {
    public static void main(String[] args) {
        int month =4; // 1 to 12
        boolean has28Days = month ==2;
        boolean has30Days = month ==4 ||month == 6|| month == 9|| month ==11;
        boolean has31Days = !has28Days && !has30Days;

        int days = 0 ;


        if(has28Days){
days = 28;        }
        if(has30Days) {
days = 30;        }
        if(has31Days) {
days = 31;
        }
        System.out.println(days+"days");




    }
}

