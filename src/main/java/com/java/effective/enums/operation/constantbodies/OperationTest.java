package com.java.effective.enums.operation.constantbodies;

/**
 * Created by Oleg on 22 Aug 2015.
 * method toString is very useful sometimes ))
 */
public class OperationTest {

    public static void main(String[] args) {

        String firstVal = "2";
        String secondVal = "4";

        double x = Double.parseDouble(firstVal);
        double y = Double.parseDouble(secondVal);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));

    }

}