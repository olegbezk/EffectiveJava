package com.java.datastructures.simplelinkedlist;

/**
 * Created by Oleg.Bezkorovaynyi on 26 Aug 2015.
 *
 * linkList
 */
public class LinkList {

    private Link head;

    public LinkList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(int d1, double d2) {
        Link link = new Link(d1, d2);
        link.nextLink = head;
        head = link;
    }

    public Link delete() {
        Link temp = head;
        head = head.nextLink;
        return temp;
    }

    public void printLinks() {
        Link currentLink = head;
        System.out.println("Links: ");
        while (currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

}
