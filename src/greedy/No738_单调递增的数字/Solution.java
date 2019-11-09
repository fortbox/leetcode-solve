package greedy.No738_单调递增的数字;

public class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] array = String.valueOf(N).toCharArray();
        StringBuilder sb = new StringBuilder();
        int begin = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                begin = i - 1;
                break;
            }
        }
        if (begin < 0) return N;
        for (int i = 0; i <= begin - 1; i++) {
            sb.append(array[i]);
        }
        int k = array[begin] - '0' - 1;
        sb.append(k);
        for (int i = begin + 1; i < array.length; i++) {
            sb.append(9);
        }
        return monotoneIncreasingDigits(Integer.parseInt(sb.toString()));
    }
}
