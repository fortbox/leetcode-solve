/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No657_机器人能否返回原点;

class Solution {
    public boolean judgeCircle(String moves) {
        //用长度为2的数组分别表示上下和左右，上+1，下-1，右+1，左-1；RLUD
        int[] remeber = new int[2];
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'R') {
                remeber[1]++;
            } else if (c == 'L') {
                remeber[1]--;
            } else if (c == 'U') {
                remeber[0]++;
            } else if (c == 'D') {
                remeber[0]--;
            }
        }

        if (remeber[0] == 0 && remeber[1] == 0) {
            return true;
        }
        return false;
    }
}
