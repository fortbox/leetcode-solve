package greedy.No406_根据身高重建队列;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Integer[] a = {1, 3, 2, 4, 5};
        Arrays.sort(a, (o1, o2) -> o1 - o2);
        for (Integer integer : a) {
            System.out.println("integer = " + integer);
        }
    }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> (o1[0] == o2[0]) ? (o1[1] - o2[1]) : (o2[0] - o1[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) list.add(people[i][1], people[i]);
        return list.toArray(new int[list.size()][]);
    }
}
