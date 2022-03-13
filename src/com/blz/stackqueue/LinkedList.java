package com.blz.stackqueue;
public class LinkedList {
    Node top;
    public Node push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            this.top = newNode;
        } else {
            Node temp = this.top;  // 70
            this.top = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        Node temp = top;
        if (top == null) {
            System.out.println("Linked list is empty");
        } else {
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
    }
}
