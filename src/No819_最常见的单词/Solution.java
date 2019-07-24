package No819_最常见的单词;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        Solution solution = new Solution();
        String s = solution.mostCommonWord(paragraph, banned);
        System.out.println("ss = " + s);
    }


    //Split with regular expressions
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        StringTokenizer stringTokenizer=new StringTokenizer(paragraph," |!|\\?|'|,|;|\\.");
        ArrayList<String> list = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            String s=stringTokenizer.nextToken();
            System.out.println("s = " + s);
            list.add(s);
        }



        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : banned) {
            set.add(s);
        }
        for (String s : list) {
            if (set.contains(s)) continue;
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        String s = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                s = entry.getKey();
            }

        }
        return s;

    }
}
