/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No717_1比特与2比特字符;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length==1) return true;
        //1,如果倒数第二位为0,则比为1比特
        if (bits[bits.length-2]==0) return true;
        //2,如果不为零,则计数看有多少个连续一,如果是偶数个则为1比特,否则是2比特<br/>

        int count=0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i]==1) {
                count++;
            }else {
                break;
            }
        }
        if (count%2==0) return true;
        return false;
    }
}
