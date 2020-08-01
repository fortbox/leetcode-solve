package finished.dp.finished.no1528;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new TreeMap<>(Integer::compareTo);
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            builder.append(entry.getValue());
        }
        return builder.toString();
    }
}
