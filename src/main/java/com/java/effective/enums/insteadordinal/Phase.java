package com.java.effective.enums.insteadordinal;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Oleg on 23 Aug 2015.
 * Using a nested EnumMap to associate data with enum pairs
 */
public enum Phase {

    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(
                GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase src;
        private final Phase dst;

        Transition(Phase src, Phase dst) {
            this.src = src;
            this.dst = dst;
        }

        // Initialize the phase transition map
        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);

        static {
            for (Phase p : Phase.values()) {
                m.put(p, new EnumMap<Phase, Transition>(Phase.class));
            }
            for (Transition trans : Transition.values()) {
                m.get(trans.src).put(trans.dst, trans);
            }
        }

        public static Transition from(Phase src, Phase dst) {
            return m.get(src).get(dst);
        }
    }

    public static void main(String[] args) {
        for (Phase src : Phase.values()) {
            for (Phase dst : Phase.values()) {
                if (src != dst) {
                    System.out.printf("%s to %s : %s %n", src, dst,
                            Transition.from(src, dst));
                }
            }
        }
    }
}