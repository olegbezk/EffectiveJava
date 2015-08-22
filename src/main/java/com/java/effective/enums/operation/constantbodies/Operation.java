package com.java.effective.enums.operation.constantbodies;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleg on 22 Aug 2015.
 * Enum type with constant-specific class bodies and data.
 */
public enum Operation {

    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINIS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {this.symbol = symbol;}

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);

    // Implementing a fromString method on an enum type
    private static final Map<String, Operation> stringToEnum = new HashMap<String, Operation>();

    // Initialize map from constant name to enum constant
    static {
        for (Operation op : values()) {
            stringToEnum.put(op.toString(), op);
        }
    }

    // Returns Operation for string, or null if string is invalid
    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }

}
