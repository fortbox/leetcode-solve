/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package dp.No140_单词拆分II;

import java.util.*;

class Solution {
    HashMap<Integer, List<String>> map = new HashMap<>();

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Solution solution = new Solution();
        solution.wordBreak(s, wordDict).forEach(ss -> System.out.println("ss = " + ss));
    }

    /**
     * 参考官方解题,回溯法清晰简单
     *
     * @param s
     * @param wordDict
     * @return
     */
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        return word_Break(s, set, 0);

    }

    public List<String> word_Break(String s, Set<String> wordDict, int start) {
        if (map.containsKey(start)) {
            return map.get(start);
        }
        ArrayList<String> res = new ArrayList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) {
                List<String> list = word_Break(s, wordDict, end);
                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(start, res);
        return res;
    }

}