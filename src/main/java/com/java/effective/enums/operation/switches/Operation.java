package com.java.effective.enums.operation.switches;

/**
 * Created by Oleg on 22 Aug 2015.
 * Enum type that switches on its own value - questionable.
 */
public enum Operation {

    PLUS, MINUS, TIMES, DIVIDE;

    public double apply(double x, double y) {
        switch (this) {
            case PLUS: return x + y ;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("Unknown Operation : " + this);
    }

}
