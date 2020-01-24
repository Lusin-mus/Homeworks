package com.second.Model;

import java.util.Arrays;

public class CustomArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Student[] students;
    private int size;


    public CustomArrayList() {
        students = new Student[DEFAULT_CAPACITY];
        size = 0;
    }


    public Student add(Student student) {
        if (size == students.length) {
            ensureCapacity();
        }
        students[size++] = student;
        return student;
    }


    private void ensureCapacity() {
        int newCapacity = students.length * 2;
        students = Arrays.copyOf(students, newCapacity);
    }


    public int size() {
        return size;
    }


    public Student get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return students[index];
    }
    public boolean remove(Student student) {
        final Student[] st = students;
        final int size = this.size;
        int i = 0;
        found: {
            if (student == null) {
                for (; i < size; i++)
                    if (st[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (student.equals(st[i]))
                        break found;
            }
            return false;
        }
        fastRemove(st, i);
        return true;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }
}
