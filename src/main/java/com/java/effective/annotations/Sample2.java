package com.java.effective.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 * Program containing annotations with a parameter.
 */
public class Sample2 {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() { // Test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() { // Should fail(wrong exception)
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {} // Should fail (no exception)

    // Code containing an annotation with an array parameter
    @ExceptionTest({ IndexOutOfBoundsException.class,
            NullPointerException.class })
    public static void doublyBad() {
        List<String> list = new ArrayList<String>();

        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5, null);
    }

}
