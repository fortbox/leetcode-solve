package No949_给定数字能组成的最大时间;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] A ={0,0,3,1};
        System.out.println("-----------"+largestTimeFromDigits(A));
    }
    public static String largestTimeFromDigits(int[] A) {
        //找到所有的时间数
        ArrayList<String> set = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        HashSet<String> tempSet = new HashSet<>();
                        tempSet.add(String.valueOf(i));
                        tempSet.add(String.valueOf(j));
                        tempSet.add(String.valueOf(k));
                        tempSet.add(String.valueOf(l));
//                        System.out.println("tempSet.size = " + tempSet.size());
                        if (tempSet.size() == 4) {
                            System.out.println("tempSet = " + tempSet.toString());
                            set.add("" + i + j + k + l);
                            String st="" + i + j + k + l;
                            System.out.println("st = " + st);
                        }


                    }
                }
            }
        }
        String result = "";
        for (String s : set) {
            System.out.println("s = " + s);

            int a = A[s.charAt(0) - '0'];
            int b = A[s.charAt(1) - '0'];
            int c = A[s.charAt(2) - '0'];
            int d = A[s.charAt(3) - '0'];
            System.out.println("temp: "+"" + a + b + c + d);
            if (a > 2) continue;
            if (c > 5) continue;
            if (a == 2) {
                if (b > 3) continue;
            }
            if (result.length() == 0) {
                result = "" + a + b + c + d;
            } else {
                if (Integer.parseInt(result) < Integer.parseInt("" + a + b + c + d)) {
                    result = "" + a + b + c + d;
                }
            }
//            System.out.println("result = " + result);
        }
        if (result.length()==0) return "";
//        System.out.println("result = " + result);
        return result.substring(0, 2) + ":" + result.substring(2);
    }

}
