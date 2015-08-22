package com.java.effective.inference;

/**
 * Created by Oleg on 22 Aug 2015.
 *
 */
public class Value<T> {

    public static <T> T defaultvalue() {
        return  null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return ( value != null) ? value : defaultValue;
    }
}
