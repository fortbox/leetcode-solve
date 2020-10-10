/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no895;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class FreqStack {

    /**
     * hashmap，,treemap,stack
     */
    Map<Integer, Integer> freMap;
    TreeMap<Integer, Stack<Integer>> groupMap;
    int maxValue;

    public FreqStack() {
        freMap = new HashMap<>();
        groupMap = new TreeMap<>((o1, o2) -> o2 - o1);
        maxValue = 0;
    }

    public static void main(String[] args) {
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(5);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
//        freqStack.push(5);
        System.out.println("1freqStack.pop() = " + freqStack.pop());
        System.out.println("2freqStack.pop() = " + freqStack.pop());
        System.out.println("3freqStack.pop() = " + freqStack.pop());
        System.out.println("4freqStack.pop() = " + freqStack.pop());
    }

    public void push(int x) {
        int fre = freMap.getOrDefault(x, 0) + 1;
        freMap.put(x, fre);
        if (fre > maxValue) maxValue = fre;
        groupMap.computeIfAbsent(fre, o -> new Stack<>()).push(x);


    }

    public int pop() {
        int res = groupMap.get(maxValue).pop();

        freMap.put(res, freMap.get(res) - 1);
        if (groupMap.get(maxValue).size() == 0) {
            groupMap.keySet().forEach(System.out::println);
            groupMap.values().forEach(System.out::println);
            maxValue -= 1;
        }
        return res;
    }
}