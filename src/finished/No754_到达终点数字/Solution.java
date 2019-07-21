package finished.No754_到达终点数字;

class Solution {
    public int reachNumber(int target) {
        //No problem-solving ideas, reference online problem-solving ideas
        target = Math.abs(target);
        int i = 0;
        int sum = 0;
        while (sum < target) {
            sum += i;
            i++;
        }
//        System.out.println("i = " + i);
        if (sum == target || ((sum - target) % 2 == 0)) return i;
        if (i % 2 == 0) return i + 1;
        return i + 2;
    }
}
