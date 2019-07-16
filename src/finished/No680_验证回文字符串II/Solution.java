package finished.No680_验证回文字符串II;

class Solution {

    public static void main(String[] args) {
        String s="deeee";
        System.out.println(validPalindrome(s));
    }
    static int deleteNum = 0;
    public static boolean validPalindrome(String s) {
        //左右两个指针，然后遍历一遍就行了
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            if (a-b==0) {
                i++;
                j--;
            }else{
                deleteNum++;
                break;
            }
        }
        if (i>=j){
            return true;
        }
        if (deleteNum>1){
            return false;
        }
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        String s1=s.substring(i+1,j+1);
        System.out.println("s1 = " + s1);
        String s2=s.substring(i,j);
        System.out.println("s2 = " + s2);
        return validPalindrome(s1)||validPalindrome(s2);
    }
}