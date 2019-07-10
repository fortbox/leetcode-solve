package finished.No509_斐波那契数;

public class Solution {


    public int fib(int N) {
        int n = N;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n > 2) {
            return fib(n - 1) + fib(n - 2);
        }
        return 0;
    }
}
