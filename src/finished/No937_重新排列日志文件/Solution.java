package finished.No937_重新排列日志文件;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> numarr = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs[i].length(); j++) {
                if (logs[i].charAt(j) == ' ') {
                    String flag = logs[i].substring(0, j);
                    String key = logs[i].substring(j + 1);
                    if (key.charAt(0) >= '0' && key.charAt(0) <= '9') {
                        numarr.add(key);
                    } else {
                        arr.add(key);
                    }
                    if (map.containsKey(key)) {
                        List<String> list = map.get(key);
                        list.add(flag);
                        map.put(key, list);

                    } else {
                        List<String> list = new ArrayList<>();
                        list.add(flag);
                        map.put(key, list);
                    }
                    break;
                }
            }
        }
        Collections.sort(arr);
        String[] ans = new String[logs.length];
        int i = 0;
        for (i = 0; i < arr.size();) {
            String value = arr.get(i);
            List<String> list =map.get(value);
            Collections.sort(list);
            for (String s : list) {
                StringBuilder sb = new StringBuilder(s);
                sb.append(" ").append(value);
                ans[i++] = sb.toString();
            }
        }
        for (int j = 0; j < numarr.size();) {
            String value = numarr.get(j);
            List<String> list =map.get(value);
            for (String s : list) {
                StringBuilder sb = new StringBuilder(s);
                sb.append(" ").append(value);
                ans[i] = sb.toString();
                i++;
                j++;
            }

        }
        return ans;
    }
}

