package com.java.datastructures.simplelinkedlist;

/**
 * Created by Oleg.Bezkorovaynyi on 26 Aug 2015.
 *
 * Test class.
 */
public class LinkListTest {
    public static void main(String[] args) {

        LinkList lList = new LinkList();

        lList.insert(1, 1.01);
        lList.insert(2, 2.02);
        lList.insert(3, 3.03);
        lList.insert(4, 4.04);
        lList.insert(5, 5.05);

        lList.printLinks();

        while (!lList.isEmpty()) {
            Link deletedLink = lList.delete();
            System.out.println("Deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        lList.printLinks();

    }
}