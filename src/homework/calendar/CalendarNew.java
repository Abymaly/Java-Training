package homework.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarNew {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();

        //int actYear = todayDate.getYear();
        //int actMonth = todayDate.getMonthValue();
        int actDay = todayDate.getDayOfMonth();

        int daysInMonth = todayDate.lengthOfMonth();

        System.out.println ("\n" + Month.of(todayDate.getMonthValue()).toString() + " " + todayDate.getYear() + "\n");

        DayOfWeek[] dayOfWeek = DayOfWeek.values();

        for (DayOfWeek days : dayOfWeek) {
            //TODO zmienić "%11s" na przekazanie wartości ze zmiennej columnWidth
            System.out.format("%11s", days.name());
        }

        int columnWidth = 11;

        String newLine = "\n";
        StringBuffer sbLine = new StringBuffer(newLine);
        for(int i = 0; i != dayOfWeek.length*columnWidth; ++i) {
            sbLine.append('-');
        }
        sbLine.append("\n");

        System.out.println(sbLine.toString());






        // LocalDate monthBegin = todayDate.minusDays(actDay - 1);
        // LocalDate monthEnd = (monthBegin.plusMonths(1)).minusDays(1);

        // int firstDay = monthBegin.getDayOfMonth();
        // int lastDay = monthEnd.getDayOfMonth();


        // DayOfWeek beginWeekday = monthBegin.getDayOfWeek();
        // int valueBeginWeekday = beginWeekday.getValue();


        // int[][] calendar;
        // calendar = new int[weekdaysValue][7];

        // for (int i = 0; i != calendar[0].length; ++i) {
        //     calendar[0][i] = i + 1;
        // }

        // for (int i = valueBeginWeekday - 1; i != calendar[0].length; ++i) {
        //     calendar[1][i] = firstDay;
        //     firstDay++;
        // }

        // for (int i = 2; i != calendar.length; ++i) {
        //     for (int j = 0; j != calendar[0].length; ++j) {
        //         calendar[i][j] = firstDay;
        //         firstDay++;
        //     }
        // }

        // System.out.println("\n" + Month.of(actMonth).toString() + "   " + actYear + "\n");

        // for (int i = 0; i != calendar[0].length; ++i) {
        //     System.out.format("%11s", DayOfWeek.of((calendar[0][i])).toString());
        // }
        // System.out.println("\n-------------------------------------------------------------------------------");

        // for (int i = 1; i != calendar.length; ++i) {
        //     for (int j = 0; j != calendar[0].length; ++j) {
        //         if ((calendar[i][j] == 0) || (calendar[i][j] > lastDay)) {
        //             System.out.format("%11s", "");
        //         } else if (calendar[i][j] == actDay) {
        //             System.out.format("%8s", "[" + calendar[i][j] + "]");
        //             System.out.print("   ");
        //         } else {
        //             System.out.format("%8s", calendar[i][j]);
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println("\n-------------------------------------------------------------------------------");
        // }
    }
}

