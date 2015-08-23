package com.java.effective.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Oleg on 24 Aug 2015.
 * <p>
 * Test program for exception test.
 */
public class RunExceptionTests {

    public static void main(String[] args) throws Exception {

        int tests = 0;
        int passed = 0;

        Class testClass = Class.forName("com.java.effective.annotations.Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Exception>[] excTypes =
                            m.getAnnotation(ExceptionTest.class).value();
                    int oldPassed = passed;
                    for (Class<? extends Exception> excType : excTypes) {
                        if (excType.isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed) {
                        System.out.printf("Test %s failed: %s %n", m, exc);
                    }
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }

}