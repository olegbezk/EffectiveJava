package com.java.effective.enums;

/**
 * Created by Oleg on 22 Aug 2015.
 *
 */
public class WeightTable {

    public static void main(String[] args) {

         String commandLineArg = "175";
        String weightOfEarth = "5.972E+24";

        double earthWeight = Double.parseDouble(commandLineArg);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));

    }
}