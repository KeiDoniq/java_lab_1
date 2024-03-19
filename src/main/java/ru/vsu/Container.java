package ru.vsu;

public class Container {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head, tail;

    public Container() {
        this.head = null;
        this.tail = null;
    }
}
