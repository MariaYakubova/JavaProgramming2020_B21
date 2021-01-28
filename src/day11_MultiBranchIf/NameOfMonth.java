package day11_MultiBranchIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 11; //1~12
        String month = "";
        if (number == 1) {
            month = "Jan";
        }
        if (number == 2) {
            month = "Feb";
        }
        if (number == 3) {
            month = "Mar";
        }
        if (number == 4) {
            month = "Apr";
            {

            }
            if (number == 5) {
                month = "May";
                {

                }
                if (number == 6) {
                    month = "June";
                }
                if (number == 7) {
                    month = "July";
                }
                if (number == 8) {
                    month = "Aug";
                }
                if (number == 9) {
                    month = "Sep";
                }
                if (number == 10) {
                    month = "Oct";
                }
                if (number == 11) {
                    month = "Nov";
                } else {
                    month = "Dec";
                }
                System.out.println("Month is"+month);
            }
        }
    }
}
