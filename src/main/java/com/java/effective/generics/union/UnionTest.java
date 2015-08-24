package com.java.effective.generics.union;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 *
 */
public class UnionTest {

    public static void main(String[] args) {

        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Garry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Joe"));
        Set<String> res = Union.union(guys, stooges);
        System.out.println(res);

    }

}