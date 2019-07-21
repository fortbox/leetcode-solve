package finished.No744_寻找比目标字母大的最小字母;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return this.search(letters, target);
    }

    //Violent solution
    private char search(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }

    //Binary search
    private char search1(char[] letters, char target) {
        int begin = 0;
        int end = letters.length - 1;
        while (begin <= end) {
            int mid = (begin + end + 1) >> 1;
            char middle = letters[mid];
            if (middle <= target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin<letters.length?letters[begin]:letters[0];
    }
}