package com.java.effective.annotations.override;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Oleg on 24 Aug 2015.
 * Spot the bug
 */
public class Bigram {

    private final char first;

    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram)) {
            return false;
        }
        Bigram b = (Bigram) o;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {

        Set<Bigram> bigramSet = new HashSet<Bigram>();

        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                bigramSet.add(new Bigram(ch, ch));
            }
        }
        System.out.println(bigramSet.size());
    }

}