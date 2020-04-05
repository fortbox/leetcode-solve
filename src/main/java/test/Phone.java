/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package test;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Phone implements Comparable<Phone> {
    private int number;
    private int card;

    private Phone(int number, int card) {
        this.number = number;
        this.card = card;
    }

    public static Phone of(int number, int card) {
        Preconditions.checkArgument(number > 30);
        Preconditions.checkArgument(card > 30);

        return new Phone(number, card);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", card=" + card +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number &&
                card == phone.card;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, card);
    }

    public static void main(String[] args) {
        Phone phone = Phone.of(40, 50);
        Phone phone1 = Phone.of(50, 50);
        System.out.println("phone.toString() = " + phone.toString());
        System.out.println("phone.compareTo(phone1) = " + phone.compareTo(phone1));
        ArrayList<Phone> list = Lists.newArrayList(phone1, phone);
        Collections.sort(list);
        list.forEach(System.out::println);
    }


    @Override
    public int compareTo(@Nullable Phone o) {
        return Comparator.comparingInt((Phone p) -> p.number).thenComparing(p -> p.card).compare(o, this);
    }
}
