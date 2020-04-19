/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        testLimit();
    }

    //    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
//        System.out.println("collect = " + collect);
//    }
//    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(5, 8, 2, 6, 41, 11);
//        //排序默认为顺序  顺序 = [2, 5, 6, 8, 11, 41]
//        List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());
//        System.out.println("顺序 = " + sorted);
//        //逆序    逆序 = [41, 11, 8, 6, 5, 2]
//        List<Integer> reverseOrder = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("逆序 = " + reverseOrder);
//        //也可以接收一个lambda
////        List<Integer> ages = integers.stream().sorted(Comparator.comparing(BIConversion.User::getAge)).collect(Collectors.toList());
//    }
    public static void testLimit() {
        List<Integer> integers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        //截取流中得前三个元素  collect = [1, 2, 1]
        List<Integer> collect = integers.stream().limit(3).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    public static void testFilter() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //截取所有能被2整除得数据
        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }


    //通过数组,Stream.of()
    static void gen1() {
        String[] str = {"a", "b", "c"};
        Stream<String> str1 = Stream.of(str);
        str1.forEach(s -> System.out.println("s = " + s));
    }

    //通过集合
    static void gen2() {
        List<String> strings = Arrays.asList("a", "b", "c");
        Stream<String> stream = strings.stream();
    }

    //通过Stream.generate方法来创建
    static void gen3() {
        //这是一个无限流，通过这种方法创建在操作的时候最好加上limit进行限制
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(x -> System.out.println(x));
    }

    //通过Stram.iterate方法
    static void gen4() {
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(10).forEach(x -> System.out.println(x));
    }

    //其他API
    static void gen5() {
        String str = "abc";
        IntStream chars = str.chars();
        System.out.println("chars.sum() = " + chars.sum());
    }
}

