package greedy.finished.No948_令牌放置;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        if (tokens.length == 0) {
            return 0;
        }
        Arrays.sort(tokens);
        int score = 0;
        /**
         * 如果现在有能量，那必须去换取能量值最小的。
         * 如果现在有分数，则首先必须去看剩余的令牌大于2，然后换取较大的能量，然后换取上面的分数
         *
         */
        int i = 0;
        int j = tokens.length - 1;
        while (j > i) {
            if (P >= tokens[i]) {
                P -= tokens[i];
                i++;
                score++;
            } else if (score > 0) {
                score--;
                P += tokens[j];
                j--;
            } else {
                break;
            }
        }
        return P >= tokens[i] ? score + 1 : score;
    }
}
