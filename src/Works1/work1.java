package Works1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class work1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM/dd/YYYY");

        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");//MMMM for full name of months
        System.out.println(date1.format(dtf2));

    }

}
