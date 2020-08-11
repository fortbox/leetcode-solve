package no368;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    static List<Set<Integer>> list = new ArrayList<>();

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        /**
         * 遍历，分组，直到老的数组没有数据。
         */
        List<Integer> integerList = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        while (integerList.size() > 0) {
            Set<Integer> set = new HashSet<>();
            Integer n = integerList.get(0);
            set.add(integerList.get(0));
            Iterator<Integer> iterator = integerList.iterator();
            boolean f = true;
            A:
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                for (Integer integer : set) {
                    if (next % integer != 0) {
                        continue A;
                    }
                }
                set.add(next);
                iterator.remove();
            }
            list.add(set);
        }
        list.sort(Comparator.comparingInt(Set::size));
        return new ArrayList<>(list.get(list.size() - 1));
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 18, 54, 108, 540, 90, 180, 360, 720};
        List<Integer> ans = largestDivisibleSubset(nums);
        System.out.println("ans = " + ans);
    }
}