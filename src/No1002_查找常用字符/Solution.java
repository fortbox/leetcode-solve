package ToDo.No1002_查找常用字符;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (A == null || A.length == 0) {
            return arrayList;
        }
        String baseStr = A[0];
        for (int i = 0; i < baseStr.length(); i++) {
            String ss = String.valueOf(baseStr.charAt(i));
            boolean flag = true;
            for (int j = 1; j < A.length; j++) {
                StringBuffer stringBuffer = new StringBuffer(A[j]);
                if (stringBuffer.indexOf(ss) == -1) {
                    flag = false;
                    break;
                }
                int k = stringBuffer.indexOf(ss);
                stringBuffer.delete(k, k + 1);
                A[j]=stringBuffer.toString();
            }
            if (flag) {
                arrayList.add(ss);
            }
        }
        return arrayList;
    }
}
