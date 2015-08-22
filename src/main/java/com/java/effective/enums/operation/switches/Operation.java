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

    // Switch on an enum to simulate a missing method
    public static Operation inverse(Operation op) {
        switch (op) {
            case PLUS: return Operation.MINUS;
            case MINUS: return Operation.PLUS;
            case TIMES: return Operation.DIVIDE;
            case DIVIDE:return Operation.TIMES;
            default: throw new AssertionError("Unknown Operation : " + op);
        }
    }

}
