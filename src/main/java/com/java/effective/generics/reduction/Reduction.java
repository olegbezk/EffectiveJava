package com.java.effective.generics.reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 * List-based generic reduction.
 */
public class Reduction {

    static <E> E reduce(List<E> list, Function<E> function, E initVal) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<E>();
        }
        E result = initVal;
        for (E e : snapshot) {
            result = function.apply(result, e);
        }
        return  result;
    }

    // A few sample functions
    private static final Function<Integer> SUM = new Function<Integer>() {
        public Integer apply(Integer aArg, Integer bArg) {
            return aArg + bArg;
        }
    };

    private static final Function<Integer> PRODUCT = new Function<Integer>() {
        public Integer apply(Integer aArg, Integer bArg) {
            return aArg * bArg;
        }
    };

    private static final Function<Integer> MAX = new Function<Integer>() {
        public Integer apply(Integer aArg, Integer bArg) {
            return Math.max(aArg, bArg);
        }
    };

    private static final Function<Integer> MIN = new Function<Integer>() {
        public Integer apply(Integer aArg, Integer bArg) {
            return Math.min(aArg, bArg);
        }
    };

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(2, 7, 1, 8, 2, 8, 1, 8, 2, 8);

        // Reduce intList using each of the above reducers
        System.out.println(reduce(intList, SUM, 0));
        System.out.println(reduce(intList, PRODUCT, 1));
        System.out.println(reduce(intList, MAX, Integer.MIN_VALUE));
        System.out.println(reduce(intList, MIN, Integer.MAX_VALUE));

    }

}