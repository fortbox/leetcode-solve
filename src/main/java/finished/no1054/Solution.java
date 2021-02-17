/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no1054;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        // python 优先队列没有Java好用，故用Java
        HashMap<Integer, Heaper> map = new HashMap<>();
        for (int barcode : barcodes) {
            if (map.containsKey(barcode)) {
                Heaper heaper = map.get(barcode);
                heaper.y += 1;
            } else {
                map.put(barcode, new Heaper(barcode, 1));
            }
        }
        PriorityQueue<Heaper> queue = new PriorityQueue<>((o1, o2) -> o2.y - o1.y);
        for (Heaper heaper : map.values()) {
            queue.add(heaper);
        }
//        ArrayList<Integer> list = new ArrayList<>();
        int[] res = new int[barcodes.length];
        int index = 0;
        while (queue.size() > 1) {
            Heaper h1 = queue.poll();
            Heaper h2 = queue.poll();
//            list.add(h1.x);
//            list.add(h2.x);
            res[index++] = h1.x;
            res[index++] = h2.x;
            h1.y -= 1;
            h2.y -= 1;
            if (h1.y > 0) queue.add(h1);
            if (h2.y > 0) queue.add(h2);
        }
        if (queue.size() > 0) res[index++] = queue.poll().x;
        return res;
    }

    class Heaper {
        int x;
        int y;

        public Heaper(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}