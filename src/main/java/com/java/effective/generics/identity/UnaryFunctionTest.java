package com.java.effective.generics.identity;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 * Test class.
 */
public class UnaryFunctionTest {

    public static void main(String[] args) {

        String[] strings = { "jute", "hemp", "nylon" };

        UnaryFunction<String> sameString = UnaryFunctionImpl.identityFunction();

        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};

        UnaryFunction<Number> sameNumber = UnaryFunctionImpl.identityFunction();

        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }

    }

}