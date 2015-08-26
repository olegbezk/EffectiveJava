package com.java.datastructures.linkedlist;

/**
 * Created by Oleg.Bezkorovaynyi on 26 Aug 2015.
 * <p>
 * linkedList implementation.
 */
public class LinkList {

    //reference to the head node
    private Node head;
    private int listCount;

    public LinkList() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        // appends the specified element to the end of this list.
        Node linkTemp = new Node(data);
        Node linkCurrent = head;
        // starting at the head node, crawl to the end of the list
        while (linkCurrent.getNext() != null) {
            linkCurrent = linkCurrent.getNext();
        }
        // the last node's "next" reference set to our new node
        linkCurrent.setNext(linkTemp);
        listCount++; //increment number of elements variable
    }

    public void add(Object data, int index) {
        // inserts the specified element at the specified position in this list
        Node linkTemp = new Node(data);
        Node linkCurrent = head;
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 0; i < index && linkCurrent.getNext() != null; i++) {
            linkCurrent = linkCurrent.getNext();
        }
        // set the new node's next-node reference to this node's next-node
        // reference
        linkTemp.setNext(linkCurrent.getNext());
        linkCurrent.setNext(linkTemp);
        listCount++; //increment number of elements variable
    }

    public Object get(int index) {
        // returns the element at the specified position in this list.
        if (index <= 0) {
            return null;
        }
        Node linkCurrent = head.getNext();
        for (int i = 1; i < index; i++) {
            if (linkCurrent.getNext() == null) {
                return null;
            }
            linkCurrent = linkCurrent.getNext();
        }
        linkCurrent = linkCurrent.getNext();

        return linkCurrent.getData();
    }

    public boolean remove(int index) {
        // removes the element at the specified position in this list.

        // if the index is out of range, exit
        if (index < 1 || index > size()) {
            return false;
        }
        Node linkCurrent = head;
        for (int i = 1; i < index; i++) {
            if (linkCurrent.getNext() == null) {
                return false;
            }
            linkCurrent = linkCurrent.getNext();
        }
        linkCurrent.setNext(linkCurrent.getNext().getNext());
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    @Override
    public String toString() {
        Node linkCurrent = head.getNext();
        String output = "";
        while (linkCurrent != null) {
            output += "[" + linkCurrent.getData().toString() + "]";
            linkCurrent = linkCurrent.getNext();
        }
        return output;
    }

    private class Node {

        // reference to the next node in the chain,
        // or null if there isn't one.
        Node next;
        // data carried by this node.
        // could be of any type you need.
        Object data;

        //Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        // another Node constructor if we want to
        // specify the node to point to.
        public Node(Object dataValue, Node nextValue) {
            data = dataValue;
            next = nextValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

    }
}
