package No762_二进制表示中质数个计算置位;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int L = 6;
        int R= 10;
        int r=countPrimeSetBits(L,R);
        System.out.println("r = " + r);

    }


    public static int countPrimeSetBits(int L, int R) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 32; i++) {
            list.add(i);

        }
        for (int i = 2; i <= 32; i++) {
            for (int j = i; j * i <= 32; j++) {
                list.remove(Integer.valueOf(j * i));
            }
        }
        int result = 0;
        for (int i = L; i <= R; i++) {

            int k=Integer.bitCount(i);
            if (list.contains(k)) {
                result++;
            }
        }
        return result;
    }
}
