package greedy.finished.No435_无重叠区间;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{0, 2}, {2, 4}, {1, 3}, {3, 5}, {4, 6}};
        System.out.println(solution.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) return 0;
        Arrays.sort(intervals, (o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));
        int point = intervals[0][1];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= point) {
                point = intervals[i][1];
            } else if (point >= intervals[i][1]) {
                point = intervals[i][1];
                res++;
            } else if (point > intervals[i][0]) {
                res++;
            }
        }
        return res;
    }
}