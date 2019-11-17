package greedy.finished.No842_将数组拆分成斐波那契数列;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String S = "417420815174208193484163452262453871040871393665402264706273658371675923077949581449611550452755";
        List<Integer> list = splitIntoFibonacci(S);
        for (Integer integer : list) {
            System.out.print("," + integer);
        }
    }


    public static List<Integer> splitIntoFibonacci(String S) {
        String s = S;
        for (int i = 1; i <= Math.min(10, S.length() / 2); i++) {
            for (int j = i + 1; (j - i) <= Math.min(10, S.length() / 2) && S.length() - j >= i && S.length() - j >= (j - i); j++) {
                ArrayList<Integer> list = new ArrayList<>();
                String s_1 = s.substring(0, i);
                String s_2 = s.substring(i, j);
                if (check_s(s_1, s_2)) {
                    break;
                }
                long n_1 = Long.parseLong(s_1);
                long n_2 = Long.parseLong(s_2);
                if (check_n(n_1, n_2)) {
                    continue;
                }
                int t_1 = Math.toIntExact(n_1);
                int t_2 = Math.toIntExact(n_2);
                list.add(t_1);
                list.add(t_2);
                if (judge_rest(list, s.substring(j), t_1, t_2)) {
                    return list;
                }
            }
        }
        return new ArrayList<>();
    }

    private static boolean judge_rest(List<Integer> list, String s, int t_1, int t_2) {
        int t_3 = t_1 + t_2;
        String s_3 = String.valueOf(t_3);
        if (s.startsWith(s_3)) {
            list.add(t_3);
            return judge_rest(list, s.substring(s_3.length()), t_2, t_3);
        } else if ("".equals(s)) {
            return true;
        } else {
            return false;
        }


    }


    private static boolean check_n(long n1, long n2) {
        if (n1 > Integer.MAX_VALUE || n2 > Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private static boolean check_s(String s1, String s2) {
        if ((s1.startsWith("0") && s1.length() > 1) || (s2.startsWith("0")) && s2.length() > 1) {
            return true;
        }
        return false;
    }
}
