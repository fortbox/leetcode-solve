package finished.No507_完美数;

public class Solution {


    public static void main(String[] args) {

        int num = 99999998;
        System.out.println(checkPerfectNumber(num));
    }

    /**
     * 用一个list记录它的整除数，然后计算和
     *
     * @param num
     * @return
     */
    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int n = 1;
        for (int i = 2; i <(int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                n=n+i+num/i;
                if (n>num){
                    return false;
                }
            }
        }
        if (n == num) {
            return true;
        }
        return false;

    }
}
