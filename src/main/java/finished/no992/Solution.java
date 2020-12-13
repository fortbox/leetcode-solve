package finished.no992;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        // 做这道题感觉智商严重不足，参考官方
        Window window1 = new Window();
        Window window2 = new Window();

        int ans = 0, left1 = 0, left2 = 0;
        for (int right = 0; right < A.length; right++) {
            int x = A[right];
            window1.add(x);
            window2.add(x);
            while (window1.different() > K) {
                window1.remove(A[left1]);
                left1++;
            }
            while (window2.different() >= K) {
                window2.remove(A[left2]);
                left2++;
            }
            ans += left2 - left1;
        }
        return ans;
    }

    class Window {
        Map<Integer, Integer> count = new HashMap<>();
        int nonzero = 0;

        void add(int x) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) == 1) nonzero++;
        }

        void remove(int x) {
            count.put(x, count.getOrDefault(x, 0) - 1);
            if (count.get(x) == 0) nonzero--;
        }

        int different() {
            return nonzero;
        }
    }


}