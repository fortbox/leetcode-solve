package finished.No868_二进制间距;

class Solution {
    public static void main(String[] args) {
        int N=15;
        Solution solution = new Solution();
        int result=solution.binaryGap(N);
        System.out.println("result = " + result);
    }


    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
//        System.out.println("s = " + s);
        int max = 0;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
//            System.out.println("s.charAt(i) = " + s.charAt(i));
            if (s.charAt(i) == '1') {
                if (index < 0) {
                    index = i;
                } else {
                    int temp = i - index;
                    max = Math.max(temp, max);
                    index = i;
                }
            }
        }
        return max;
    }
}
