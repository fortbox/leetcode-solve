/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1360;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Solution {
    public static void main(String[] args) {
        String s1 = "2019-06-29";
        String s2 = "2019-06-30";
        int dif = daysBetweenDates(s1, s2);
        System.out.println("dif = " + dif);

    }

    public static int daysBetweenDates(String date1, String date2) {
        return (int) ChronoUnit.DAYS.between(LocalDate.parse(date1, DateTimeFormatter.ISO_LOCAL_DATE), LocalDate.parse(date2, DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
