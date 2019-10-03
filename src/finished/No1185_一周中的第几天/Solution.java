package finished.No1185_一周中的第几天;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dw = date.getDayOfWeek();
        String[] wk = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return wk[dw.getValue() - 1];
    }
}