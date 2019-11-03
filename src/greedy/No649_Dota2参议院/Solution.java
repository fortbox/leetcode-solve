package greedy.No649_Dota2参议院;

public class Solution {
    public String predictPartyVictory(String senate) {
        int person = 0;
        boolean R = true, D = true;
        char[] charArray = senate.toCharArray();
        while (R && D) {
            R = false;
            D = false;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'R') {
                    R = true;
                    if (person < 0) charArray[i] = 'P';
                    person++;
                } else if (charArray[i] == 'D') {
                    D = true;
                    if (person > 0) charArray[i] = 'P';
                    person--;
                }
            }
        }
        return person > 0 ? "Radiant" : "Dire";
    }
}
