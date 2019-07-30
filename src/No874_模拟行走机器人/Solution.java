package No874_模拟行走机器人;

import java.util.HashSet;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        int max = 0;
        int k = 0;
        int[][] dc = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            set.add(obstacles[i][0] + "," + obstacles[i][1]);
        }
        int px = 0;
        int py = 0;
        for (int command : commands) {
            if (command == -1) {
                k = (k + 1) % 4;
            } else if (command == -2) {
                k = (k + 3) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    if (set.contains((px +  dc[k][0]) + "," + (py + dc[k][1]))){
                        break;
                    }
                    px +=  dc[k][0];
                    py +=  dc[k][1];
                }
                max = Math.max(max, px * px + py * py);

            }
        }
        return max;
    }
}
