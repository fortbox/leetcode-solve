/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no1629

class Solution {
    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        val array = keysPressed.toCharArray()
        var keepTimes = mutableListOf<Int>()
        for ((index, value) in releaseTimes.withIndex()) {
            if (index == 0) {
                keepTimes.add(value)
            } else {
                keepTimes.add(releaseTimes[index] - releaseTimes[index - 1])
            }
        }
        val maxValue = keepTimes.max()
        var l = mutableListOf<Char>()
        for ((index, value) in keepTimes.withIndex()) {
            if (value == maxValue) l.add(array[index])
        }
        l.sortDescending()
        return l[0]
    }
}