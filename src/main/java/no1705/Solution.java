/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no1705;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int eatenApples(int[] apples, int[] days) {
        // 贪心策略，先吃最先坏掉的苹果
        int length = apples.length;
        PriorityQueue<Apple> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.shelfLife));
        int count = 0;
        for (int i = 0; i < length; i++) {
            int num = apples[i];
            int life = days[i];
            Apple apple = new Apple(num, life + i);
            queue.add(apple);
            while (queue.peek().shelfLife <= i) {
                queue.poll();
            }
            if (queue.size() > 0) {
                Apple poll = queue.poll();
                count += 1;
                poll.numberOfApples -= 1;
                if (poll.numberOfApples > 0) {
                    queue.add(poll);
                }
            }
        }
        int c = length;
        while (queue.size() > 0) {
            while (queue.size() > 0 && queue.peek().shelfLife <= c) {
                queue.poll();
            }
            if (queue.size() > 0) {
                Apple poll = queue.poll();
                count += 1;
                poll.numberOfApples -= 1;
                if (poll.numberOfApples > 0) {
                    queue.add(poll);
                }
            }
            c += 1;
        }
        return count;
    }

    class Apple {
        int numberOfApples;
        int shelfLife;

        public Apple(int numberOfApples, int shelfLife) {
            this.numberOfApples = numberOfApples;
            this.shelfLife = shelfLife;
        }
    }
}
