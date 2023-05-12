package org.example;
import java.util.ArrayList;
import java.util.List;

public class CustomLinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean remove(T data) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        Node<T> previous = null;
        while (current != null) {
            if (current.data.equals(data)) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

}
