package com.java.effective.generics.union;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 *
 */
public class Union {

    public static <E> Set<E> union(Set<? extends E> e1, Set<? extends E> e2) {
        Set<E> result = new HashSet<E>(e1);
        result.addAll(e2);
        return result;
    }

}
