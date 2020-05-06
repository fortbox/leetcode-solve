/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no751;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> ipToCIDR(String ip, int n) {
        /**
         * 参考官方，官方解得很巧。省去了一些损耗。
         */
        long start = ipToLong(ip);
        ArrayList<String> ans = new ArrayList<>();
        while (n > 0) {
            long tmp = Long.lowestOneBit(start);
            System.out.println("tmp = " + tmp);
            int mask = Math.max(33 - bitLength(Long.lowestOneBit(start)), 33 - bitLength(n));
            ans.add(longToIp(start) + "/" + mask);
            start += 1 << (32 - mask);
            n -= 1 << (32 - mask);
        }
        return ans;
    }


    private long ipToLong(String ip) {
        long ans = 0;
        for (String s : ip.split("\\.")) {
            ans = ans * 256 + Integer.valueOf(s);
        }
        return ans;
    }

    private String longToIp(long x) {
        return String.format("%s.%s.%s.%s", x >> 24, (x >> 16) % 256, (x >> 8) % 256, x % 256);
    }


    private int bitLength(long x) {
        if (x == 0) return 1;
        int ans = 0;
        while (x > 0) {
            x = x >> 1;
            ans++;
        }
        return ans;
    }
}
