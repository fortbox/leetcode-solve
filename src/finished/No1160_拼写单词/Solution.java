package finished.No1160_拼写单词;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int res = countCharacters(words, chars);
        System.out.println("res = " + res);
    }


    public static int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int res = 0;
        for (String s : words) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }
            boolean b = true;
            for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
                Character key = entry.getKey();
                int value = entry.getValue();
                if (map.containsKey(key)) {
                    if (map.get(key) < value) {
                        b = false;
                    }
                } else {
                    b = false;
                }
            }
            if (b) {
                res += s.length();
            }

        }
        return res;
    }
}