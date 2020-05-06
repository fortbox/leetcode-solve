/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1118;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class Solution {
    public int numberOfDays(int Y, int M) {
        return LocalDate.of(Y, M, 1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
    }
}
