package com.second.collection;

import com.second.model.Student;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;
    private int index = 0;

    public DoubleLinkedList() {
        size = 0;
    }


    private class StudentIterator implements Iterator<Student> {
        private Node next;

        StudentIterator() {
            next = head;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Student next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node lastReturned = next;
            next = next.next;
            index++;
            return lastReturned.student;

        }
    }

    public StudentIterator studentIterator() {
        return new StudentIterator();
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


    public void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to remove");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
        head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to remove");
        }
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else
            tail.next = null;
        size--;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.student.getFirstName() + " " + temp.student.getLastName());
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }
    }
}
