package com.java.effective.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 * Code containing an annotation with an array parameter.
 */
public class Sample3 {
    @ExceptionArrPrmTest({IndexOutOfBoundsException.class,
            NullPointerException.class})
    public static void doublyBad() {
        List<String> list = new ArrayList<String>();
        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5, null);
    }
}
