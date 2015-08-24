package com.java.effective.generics.flexebility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 24 Aug 2015.
 *
 */
public class StackTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Nika");
        names.add("Nastia");
        names.add("Oleg");

        Stack<String> stack = new Stack<String>();

        for (String string : names) {
            stack.push(string);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }

    }

}