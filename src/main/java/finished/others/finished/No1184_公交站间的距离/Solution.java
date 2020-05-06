/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1184_公交站间的距离;

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totalDistance = 0;
        for (int i : distance) {
            totalDistance += i;
        }
        int clockWise = 0;
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        for (int i = start; i < destination; i++) {
            clockWise += distance[i];
        }
        return Math.min(totalDistance - clockWise, clockWise);
    }
}