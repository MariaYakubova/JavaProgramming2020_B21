package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2021;
        int month = 2; // 1~12
        boolean has280r29Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        //boolean has31Days = !has280r29Days||!has30Days;
        String result = "";
        if (month > 0 && month < 13) { //1~12
            if (has280r29Days) {//for Feb
                if (year % 4 == 0) {
                    result = "29 days";//Leap year
                } else {
                    result = "28 days";//not a Leap year
                }
            } else if (has30Days) {// for April, June, Sept,Nov
                result = "30 days";

            } else {// for Jan, Mar,May, Jul, Aug Oct, Dec
                result = "31 days";

            }

        } else {// if the month is invalid
            result = "Invalid Month";
        }
        System.out.println(result);
    }
}
/*
wright a program that can find the number of days in a month
Note:
 */