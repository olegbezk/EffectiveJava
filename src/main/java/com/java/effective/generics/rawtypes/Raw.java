package com.java.effective.generics.rawtypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Oleg on 24 Aug 2015.
 * <p>
 * Raw types doesn't type - safe !
 */
public class Raw {

    // Uses raw type (List) - fails at runtime!
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0); // Compiler-generated cast
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // Use of raw type for unknown element type - don't do this!
    static int rawNumElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }

    // Unbounded wildcard type - type-safe and flexible
    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }

}
