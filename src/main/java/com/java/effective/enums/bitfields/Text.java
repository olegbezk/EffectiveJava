package com.java.effective.enums.bitfields;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Oleg on 23 Aug 2015.
 * EnumSet - a modern replacement for bit fields
 */
public class Text {

    public enum Style {

        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH

    }
        // Any Set could be passed in, but EnumSet is clearly best
        public void applyStyles(Set<Style> styles) {
            // body goes here
        }
    public static void main(String[] args) {

        Text text = new Text();

        text.applyStyles(EnumSet.of(Style.ITALIC, Style.BOLD, Style.STRIKETHROUGH));

    }

}