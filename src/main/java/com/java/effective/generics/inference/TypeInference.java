package com.java.effective.generics.inference;

/**
 * Created by Oleg on 22 Aug 2015.
 * Type inference
 */
public class TypeInference {

    public static void main(String[] args) {

        final Value< String > value = new Value<String>();
        value.getOrDefault("22", Value.<String>defaultValue());

    }

}