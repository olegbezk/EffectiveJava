package com.java.effective.generics.wildcardcapture;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 * Swap the first and last argument and print the resulting list
 */
public class Swap {

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    // Private helper method for wildcard capture
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {

        List<String> argList = Arrays.asList("1", "4", "3", "7", "9");
        System.out.println(argList);
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);

    }

}