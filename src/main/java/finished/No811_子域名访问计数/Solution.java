/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No811_子域名访问计数;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        Solution solution = new Solution();
        List list = solution.subdomainVisits(cpdomains);
        System.out.println("list = " + list);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        //Split each string
        HashMap<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] ss = cpdomain.split(" ");
            int k = Integer.valueOf(ss[0]);
            String s = ss[1];
            String[] sss = s.split("\\.");
            String s1, s2, s3;
            if (sss.length == 2) {
                s1 = sss[0] + "." + sss[1];
                s2 = sss[1];
                if (map.containsKey(s1)) {
                    map.put(s1, map.get(s1) + k);
                } else {
                    map.put(s1, k);
                }
                if (map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + k);
                } else {
                    map.put(s2, k);
                }
            }
            if (sss.length == 3) {
                s1 = sss[0] + "." + sss[1] + "." + sss[2];
                s2 = sss[1] + "." + sss[2];
                s3 = sss[2];
                if (map.containsKey(s1)) {
                    map.put(s1, map.get(s1) + k);
                } else {
                    map.put(s1, k);
                }
                if (map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + k);
                } else {
                    map.put(s2, k);
                }
                if (map.containsKey(s3)) {
                    map.put(s3, map.get(s3) + k);
                } else {
                    map.put(s3, k);
                }
//                System.out.println("s1 = " + s1);
//                System.out.println("s2 = " + s2);
//                System.out.println("s3 = " + s3);
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            list.add(value + " " + key);
        }
        return list;
    }
}
