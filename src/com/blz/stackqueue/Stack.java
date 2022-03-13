package com.blz.stackqueue;

public class Stack {

    public Node top;
    public LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    //For pushing elements in Stack.(LIFO)
        public void push() {
        linkedList.push(70);
        linkedList.push(30);
        this.top = linkedList.push(56);
        System.out.println(this.top);
        linkedList.print();
    }
}