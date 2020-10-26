/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1624

class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        // 用一个map来记录，并记录最大值
        var map = mutableMapOf<Char, MutableList<Int>>()
        val array = s.toCharArray()
        var res = -1
        for (c in array.withIndex()) {
            if (map.containsKey(c.value)) {
                var arr = map.get(c.value)
                if (arr != null) {
                    arr.add(c.index)
                }
                res = Math.max(res, c.index - (map.get(c.value)?.get(0) ?: 0) - 1)
            } else {
                map.put(c.value, mutableListOf(c.index))
            }
        }
        return res
    }
}

fun main() {
    val s = "abca"
    val solution = Solution()
    val ans = solution.maxLengthBetweenEqualCharacters(s)
    println("ans:$ans")
}