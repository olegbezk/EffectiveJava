package com.java.effective.enums.enumswithinterfaces;

/**
 * Created by Oleg on 23 Aug 2015.
 * Emulated extensible enum using an interface
 */
public interface Operation {
    double apply(double x, double y);
}
