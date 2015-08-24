package com.java.effective.generics.comparable;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 * Using a recursive type bound to express mutual comparability.
 */
public class ComparableGnr {

    // Returns the maximum value in a list - uses recursive type bound
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {

        Iterator<? extends T> i = list.iterator();
        T result = i.next();

        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

}
