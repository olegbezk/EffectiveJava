package com.java.datastructures.simplelinkedlist;

/**
 * Created by Oleg.Bezkorovaynyi on 26 Aug 2015.
 *
 * Link
 */
public class Link {

    public int data1;
    public double data2;
    public Link nextLink;

    public Link(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    public void printLink() {
        System.out.println("{" + data1 + ", " + data2 + "} ");
    }
}
