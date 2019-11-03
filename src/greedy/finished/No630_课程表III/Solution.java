package greedy.finished.No630_课程表III;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] courses = {{1, 2}, {2, 3}};
        int res = solution.scheduleCourse(courses);
        System.out.println("res = " + res);
    }

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (Comparator.comparingInt(o -> o[1])));
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int day = 0;
        for (int[] cour : courses) {
            int a = cour[0];
            int b = cour[1];
            if (day + a <= b) {
                queue.offer(a);
                day += a;
            } else if (!queue.isEmpty() && queue.peek() > a) {
                day += (a - queue.poll());
                queue.offer(a);
            }
        }
        return queue.size();
    }
}
