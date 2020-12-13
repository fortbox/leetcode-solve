/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no853;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 0) return 0;
        // 计算每个车可能到达的点。然后一个一个查找
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            list.add(new Car(position[i], (double) (target - position[i]) / speed[i]));
        }
        list.sort(Comparator.comparingInt(o -> o.pos));
        int res = 0;
        int len = position.length;
        while (--len > 0) {
            if (list.get(len).needTime < list.get(len - 1).needTime) res++;
            else list.set(len - 1, list.get(len));
        }
        return res + 1;
    }

    class Car {
        int pos;
        double needTime;

        public Car(int pos, double needTime) {
            this.pos = pos;
            this.needTime = needTime;
        }
    }
}