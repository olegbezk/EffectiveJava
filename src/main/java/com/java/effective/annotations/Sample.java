package com.java.effective.annotations;

/**
 * Created by Oleg on 23 Aug 2015.
 * Program containing marker annotations.
 */
public class Sample {

    @Test
    public static void m1() {
    } //test should pass

    public static void m2() {
    }

    @Test
    public static void m3() { // test should fail
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    @Test
    public void m5() {
    } // INVALID USE: nonstatic method

    public static void m6() {
    }

    @Test
    public static void m7() { // Test should fail
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }

}
