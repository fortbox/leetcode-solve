package no692;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<Item> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(new Item(entry.getKey(), entry.getValue()));
        }
        list.sort((o1, o2) -> o2.count == o1.count ? o1.s.compareTo(o2.s) : o2.count - o1.count);
        return list.subList(0, k).stream().map(Item::getS).collect(Collectors.toList());
    }

    class Item {
        String s;
        int count;

        public Item(String s, int count) {
            this.s = s;
            this.count = count;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
