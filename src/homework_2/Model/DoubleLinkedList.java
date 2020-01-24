package com.company.Model;

import java.util.NoSuchElementException;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        size = 0;
    }

    private class Node {
        Student student;
        Node next;
        Node prev;

        public Node(Student student, Node next, Node prev) {
            this.student = student;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public Student push(Student student) {
        final Node tmp = new Node(student, head, null);
        if (head == null)
            tail = tmp;
        else
            head.prev = tmp;
        head = tmp;
        size++;
        return student;
    }

    public void addLast(Student student) {
        final Node tmp = new Node(student, null, tail);
        if (tail == null)
            head = tmp;
        else
            tail.next = tmp;
        tail = tmp;
        size++;

    }


    public Student pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to remove");
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        temp.next.prev = null;
        size--;
        return temp.student;
    }

    public Student removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to remove");
        }
        Node temp = tail;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        }
        temp.prev.next = null;
        size--;
        return temp.student;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.student.getFirstName()+ " " + temp.student.getLastName());
            if (temp.next != null) {
                temp = temp.next;
            } else{
                break;
            }
        }
    }
}
