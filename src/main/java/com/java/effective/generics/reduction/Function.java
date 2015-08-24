package com.java.effective.generics.reduction;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 * Generic Function interface.
 */
public interface Function<T> {
    T apply(T aArg, T bArg);
}
