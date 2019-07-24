package No821_字符的最短距离;

class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] a = new int[S.length()];
        int k = -1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == C) {
                a[i] = 0;
                if (k < 0) {
                    for (int j = 0; j < i; j++) {
                        a[j] = i - j;
                    }
                    k=i;
                } else if (k >= 0) {
                    for (int j = k + 1; j <= (i + k) / 2; j++) {
                        a[j] = j - k;
                    }
                    for (int m = (i + k) / 2 + 1; m <= i - 1; m++) {
                        a[m] = i - m;
                    }
                }
            }
        }
        if (k<a.length){
            for (int i = k+1; i < a.length; i++) {
                a[i]=i-k;
            }
        }

        return a;
    }
}
