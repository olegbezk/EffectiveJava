package com.java.effective.generics.identity;

/**
 * Created by Oleg on 25 Aug 2015.
 *
 *
 */
public interface UnaryFunction<T> {
    T apply(T arg);
}
