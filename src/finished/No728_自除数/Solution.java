package finished.No728_自除数;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //1,Traverse, then judge each number
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if (this.judgeNumber(i)) list.add(i);
        }

        return list;
    }
    private boolean judgeNumber(int n){
        String s=String.valueOf(n);
        for (int i = 0; i <s.length() ; i++) {
            int m=s.charAt(i)-'0';
            if (m==0||n%m!=0) return false;
        }
        return true;
    }
}
