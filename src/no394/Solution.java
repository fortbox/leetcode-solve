/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no394;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        // 用栈 ，每次读到']'时，从栈中读出字符，然后再插入到里面
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        for (char c : array) {
            if (c==']'){
                StringBuilder builder = new StringBuilder();
                while (!stack.isEmpty()&&stack.peek()!='['){
                    builder.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder repeatTimeStr=new StringBuilder();
                while (!stack.isEmpty()&&(stack.peek()<='9'&&stack.peek()>='0')){
                    repeatTimeStr.insert(0,stack.pop());
                }
                int repeatTime=Integer.parseInt(repeatTimeStr.toString())-1;
                String temp=builder.toString();
                while (repeatTime>0){
                    builder.append(temp);
                    repeatTime--;
                }
                char[] charArray = builder.toString().toCharArray();
                for (char cc : charArray) {
                    stack.add(cc);
                }
            }else {
                stack.add(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.insert(0,stack.pop());
        }
        return stringBuilder.toString();
    }
}