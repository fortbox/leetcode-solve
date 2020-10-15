/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1235;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[] dp = new int[startTime.length];
        Job[] jobs = new Job[startTime.length];
        for (int i = 0; i < startTime.length; i++) {
            dp[i] = jobs[i].profit;
        }
        for (int i = 0; i < startTime.length; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(o -> o.end));
        for (int i = 1; i < startTime.length; i++) {
            dp[i] = Math.max(dp[i - 1], jobs[i].profit);
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j].end <= jobs[i].start) {
                    dp[i] = Math.max(dp[i], dp[j] + jobs[i].profit);
                    break;
                }
            }


        }
        return dp[dp.length - 1];
    }

    class Job {
        int start;
        int end;
        int profit;

        public Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
}
