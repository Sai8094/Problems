package com.linkedlist;

public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> next;
    public Node<T> previous;
    Node<T> head;

    public Node() {}
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

   
   
}
