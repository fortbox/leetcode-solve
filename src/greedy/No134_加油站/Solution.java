package greedy.No134_加油站;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] dis = new int[gas.length];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = gas[i] - cost[i];
        }
        for (int i = 0; i < dis.length; i++) {
            if (dis[i] >= 0) {
                int k = 0;
                for (int j = i; j < dis.length; j++) {
                    k += dis[j];
                    if (k < 0) {
                        break;
                    }
                }
                for (int j = 0; j < i; j++) {
                    if (k < 0) {
                        break;
                    }
                    k += dis[j];
                }
                if (k >= 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
