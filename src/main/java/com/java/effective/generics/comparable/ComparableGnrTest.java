package com.java.effective.generics.comparable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 * Test class for ComparableGnr
 */
public class ComparableGnrTest {

    public static void main(String[] args) {

        ComparableGnr c = new ComparableGnr();

        Integer[] numbers = { 5, 2, 9, 3, 13, 44, 6 };

        List<Integer> str = Arrays.asList(numbers);

        System.out.println(c.max(str));

    }

}