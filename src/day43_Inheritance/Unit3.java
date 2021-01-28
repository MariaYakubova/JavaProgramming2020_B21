package day43_Inheritance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Unit3 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a M/d/yy");
        LocalDateTime dt1 = LocalDateTime.of(2020, 11, 23, 16, 40);
        System.out.println(dt1);
        System.out.println(dt1.format(dtf));

    }

}
