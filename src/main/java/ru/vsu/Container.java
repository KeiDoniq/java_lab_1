package ru.vsu;

import java.util.Objects;

public class Container {
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data == node.data && Objects.equals(next, node.next);
        }
        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public Container() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    /**
     * @param data the data to insert to the end of the list
     */
    public void add(int data){
        if (head == null) {
            head = new Node(data, null);
            tail = head;
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
        size = size + 1;
    }

    /**
     * @param position the position in which element will be removed
     */
    public void removeAtPosition(int position){
        if(size > 0 && position >= 0 && position < size){
            if(position == 0){
                head = head.next;
            }
            else {
                int i = 1;
                Node ptr = head;
                while (i < position) {
                    ptr = ptr.next;
                    ++i;
                }
                ptr.next = ptr.next.next;
                if (position == size - 1) {
                    tail = ptr;
                }
            }
            --size;
            if(size == 0){
                head = null;
                tail = null;
            }
        }
    }

    public int getSize() {
        return size;
    }

    /**
     * @param data data of element whose first occurrence in the list will be removed
     */
    public void removeByElement(int data) {
        if (size > 0) {
            if (head.data == data) {
                head = head.next;
                --size;
            } else {
                Node ptr = head;
                while (ptr.next != null && data != ptr.next.data) {
                    ptr = ptr.next;
                }
                if (ptr.next != null) {
                    --size;
                    ptr.next = ptr.next.next;
                    if(ptr.next == null)
                        tail = ptr;
                }
            }
            if (size == 0) {
                head = null;
                tail = null;
            }
        }
    }

    /**
     *
     * @param position position of the element
     * @return data of element at the given position
     *          or null if position out of size range
     */
    public Object getElementAt(int position){
        Object result = null;
        if(size != 0 && position < size && position >= 0) {
            Node ptr = head;
            int i = 0;
            while(i < position){
                ptr = ptr.next;
                ++i;
            }
            result = ptr.data;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Container:\t");
        if(size == 0){
            output.append("is empty.");
        }
        else {
            Node ptr = head;
            while (ptr != null) {
                output.append(ptr.data).append("\t");
                ptr = ptr.next;
            }
            output.append("\nhead = ").append(head.data);
            output.append("\ntail = ").append(tail.data);
            output.append("\nsize = ").append(size);
        }
        return output.toString();
    }
}
