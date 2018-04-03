package homework.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarNew {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        int actDay = todayDate.getDayOfMonth();

        //int daysInMonth = todayDate.lengthOfMonth();

        System.out.println("\n" + Month.of(todayDate.getMonthValue()).toString() + " " + todayDate.getYear() + "\n");

        int columnWidth = 11;
        //TODO: zamienić 11 na wartość odczytaną z długości najdłuższej nazwy

        DayOfWeek[] dayOfWeek = DayOfWeek.values();

        for (DayOfWeek days : dayOfWeek) {
            //TODO zmienić "%11s" na przekazanie wartości ze zmiennej columnWidth
            System.out.format("%11s", days.name());
        }

        String newLine = "\n";
        StringBuffer sbLine = new StringBuffer(newLine);
        for (int i = 0; i != dayOfWeek.length * columnWidth; ++i) {
            sbLine.append('-');
        }
        sbLine.append("\n");

        String nextLine = sbLine.toString();

        System.out.print(nextLine);

        LocalDate daysOfMonth = todayDate.minusDays(actDay - 1);

        //TODO zmienić "%11s" na przekazanie wartości ze zmiennej columnWidth

        for (int i = 1; i != daysOfMonth.getDayOfWeek().getValue(); ++i) {
            System.out.format("%11s", " ");
        }

        while (daysOfMonth.getMonthValue() == todayDate.getMonthValue()) {
            if (daysOfMonth.equals(todayDate)) {
                System.out.format("%11s", "[" + daysOfMonth.getDayOfMonth() + "]");
            } else {
                System.out.format("%11s", daysOfMonth.getDayOfMonth());
            }
            if (daysOfMonth.getDayOfWeek().getValue() % dayOfWeek.length == 0) {
                System.out.print(nextLine);
            }
            daysOfMonth = daysOfMonth.plusDays(1);
        }
        System.out.print(nextLine);
    }
}