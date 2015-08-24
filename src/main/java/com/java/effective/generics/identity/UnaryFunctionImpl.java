package com.java.effective.generics.identity;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 * IDENTITY_FUNCTION is stateless and its type parameter is
 * unbounded so it's safe to share one instance across all types.
 */
public class UnaryFunctionImpl {

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    // Generic singleton factory pattern
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {

        public Object apply(Object arg) {
            return arg;
        }
    };
}
