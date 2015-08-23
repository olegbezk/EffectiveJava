package com.java.effective.enums.enumswithinterfaces;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Oleg on 23 Aug 2015.
 * Test class to exercise all operations in "extension enum"
 */
public class OperationTest {

    public static void main(String[] args) {

        double x = Double.parseDouble("4");
        double y = Double.parseDouble("2");

        test(ExtendedOperation.class, x, y);

        System.out.println();

        test2(Arrays.asList(ExtendedOperation.values()), x, y);

    }

    //test parameter is a bounded type token
    private static <T extends Enum<T> & Operation> void test(Class<T> opSet,
                                                             double x, double y) {
        for (Operation op : opSet.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    // test parameter is a bounded wildcard type
    private static void test2(Collection<? extends Operation> opSet,
                              double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

}