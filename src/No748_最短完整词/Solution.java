package No748_最短完整词;

class Solution {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";

        String[] words = {"step", "steps", "stripe", "stepple"};

        Solution solution = new Solution();
        String result = solution.shortestCompletingWord(licensePlate, words);
        System.out.println("result = " + result);
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        //1, trimming the license plate, retaining characters
        String s = this.myTrimString(licensePlate);
        System.out.println("s = " + s);
        //2, traverse the array, find it and return
        int len = Integer.MAX_VALUE;
        String result = "";
        for (String word : words) {
            if (mycontains(word, s)) {
                System.out.println("word = " + word);
                System.out.println("ss = " + s);
                if (word.length() < len) {
                    result = word;
                    len=word.length();
                }
            }
        }
        return result;
    }


    private String myTrimString(String licensePlate) {
        String s = "";
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' & c <= 'Z')) {
                s += c;
            }
        }
        return s.toLowerCase();
    }

    private boolean mycontains(String word, String s) {
        String w=new String(word);
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            String temp=String.valueOf(s.charAt(i));
            if (!w.contains(temp)) {
                f = false;
            }else {
                int k=w.indexOf(s.charAt(i));
                w=w.substring(0,k)+w.substring(k+1);
            }
        }
        return f;
    }
}