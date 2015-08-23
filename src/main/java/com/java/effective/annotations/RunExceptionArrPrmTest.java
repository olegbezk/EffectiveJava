package com.java.effective.annotations;

import java.lang.reflect.Method;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 * Test class for annotation with an array parameter.
 */
public class RunExceptionArrPrmTest {

    public static void main(String[] args)throws Exception {

        int tests = 0;
        int passed = 0;

        Class testClass = Class.forName("com.java.effective.annotations.Sample3");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionArrPrmTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    Class<? extends Exception>[] excTypes =
                            m.getAnnotation(ExceptionArrPrmTest.class).value();
                    int oldPassed = passed;
                    for (Class<? extends Exception> excType : excTypes) {
                        if (excType.isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("Test %s failed: %s %n", m, exc);
                }
            }
        }

    }

}