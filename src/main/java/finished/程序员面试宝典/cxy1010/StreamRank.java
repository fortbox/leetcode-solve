/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1010;

import java.util.LinkedList;
import java.util.List;

class StreamRank {
    List<Integer> list;

    public StreamRank() {
        list = new LinkedList<>();
    }

    public void track(int x) {
        list.add(x);
    }

    public int getRankOfNumber(int x) {
        int index = -1;
        list.sort(Integer::compareTo);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > x) continue;
            index = i;
            break;
        }
        return index + 1;
    }
}

/**
 * Your StreamRank object will be instantiated and called as such:
 * StreamRank obj = new StreamRank();
 * obj.track(x);
 * int param_2 = obj.getRankOfNumber(x);
 */