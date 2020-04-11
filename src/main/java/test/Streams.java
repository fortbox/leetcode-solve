/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package test;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        Integer integer = null;
        try {
            integer = Stream.of(1, 2, 3).filter(i -> i.intValue()<3 ).
                    reduce(Integer::sum).orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("integer = " + integer);
    }
}
