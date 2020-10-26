/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1619

class Solution {
    // 排序，然后计算删除
    fun trimMean(arr: IntArray): Double {
        // sort
        arr.sort()
        //count
        val size = arr.size
        var begin = size * 5 / 100
        println("begin:$begin")
        var result = 0.0
        var count = 0

        for ((index, value) in arr.withIndex()) {
            if (index >= begin && index < (size - begin)) {
                result += value
                count++
            }
        }
        return result / count
    }
}

fun main() {
    var solution = Solution()
    var arr = intArrayOf(1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3)
    val ans = solution.trimMean(arr)
    println("ans:$ans")
}