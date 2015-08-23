package com.java.effective.enums.insteadordinal;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Oleg on 23 Aug 2015.
 * Using an EnumMap to associate data with an enum
 */
public class Herb {

    public enum Type {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;

    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        Herb[] garden = {new Herb("Basil", Type.ANNUAL),
                new Herb("Caraway", Type.BIENNIAL),
                new Herb("Dill", Type.ANNUAL),
                new Herb("Lavender", Type.PERENNIAL),
                new Herb("Parsley", Type.BIENNIAL),
                new Herb("Rosemary", Type.PERENNIAL)};

        // Using an EnumMap to associate data with an enum
        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Type, Set<Herb>>(Herb.Type.class);

        for (Herb.Type t : Herb.Type.values()) {
            herbsByType.put(t, new HashSet<Herb>());
        }

        for (Herb h : garden) {
            herbsByType.get(h.type).add(h);
            System.out.println(herbsByType);
        }

    }

}