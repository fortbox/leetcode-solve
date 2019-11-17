package greedy.finished.No881_救生艇;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int res = 0;
        while (i < j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
                res++;
            } else if (people[i] + people[j] > limit) {
                j--;
                res++;
            }
            if (i == j) {
                res++;
                break;
            }
        }
        return res;
    }
}
