package enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Months april = Months.APRIL;
        System.out.println("Holidays of April: " + Arrays.toString(april.getHoliday()));
        System.out.println();

        Months march = Months.MARCH;
        System.out.println("Count of Days of March: " + march.getNumberOfDays());
        System.out.println();

        System.out.println("Months names");
        Months[] months = Months.values();
        for (Months month : months) {
            System.out.println(month);
        }
        System.out.println();

        System.out.println("Is March 8 a public holiday: " + march.checkHolidays(8));
        System.out.println("Is March 21 a public holiday: " + march.checkHolidays(21));


    }

}