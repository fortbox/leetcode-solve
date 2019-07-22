package No784_字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                list = myadd(list, i, S);
            }
        }
        if (list == null || list.size() == 0) {
            list.add(S);
        }
        return list;
    }

    private List myadd(List<String> list, int i, String s) {
        char c = s.charAt(i);

        ArrayList<String> list1 = new ArrayList<>();
        if (list == null || list.size() == 0) {
            list.add(s);
            String ss = "";
            if (c >= 'a' && c <= 'z') ss = s.substring(0, i) + String.valueOf(c).toUpperCase() + s.substring(i + 1);
            if (c >= 'A' && c <= 'Z') ss = s.substring(0, i) + String.valueOf(c).toLowerCase() + s.substring(i + 1);
            list.add(ss);
            list1.addAll(list);
            return list1;
        }
        list1.addAll(list);
        for (String ss : list) {
            if (c >= 'a' && c <= 'z') ss = ss.substring(0, i) + String.valueOf(c).toUpperCase() + ss.substring(i + 1);
            if (c >= 'A' && c <= 'Z') ss = ss.substring(0, i) + String.valueOf(c).toLowerCase() + ss.substring(i + 1);
            list1.add(ss);
        }
        return list1;
    }
}
