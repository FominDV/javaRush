package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        if (first.next == null) {
            first.next = newNode;
            last.prev = newNode;
            return;
        }
        last.prev.next = newNode;
        newNode.prev = last.prev;
        last.prev = newNode;
        //напишите тут ваш код
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
