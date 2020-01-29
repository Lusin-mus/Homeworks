package com.second.collection;

import com.second.model.Student;

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
        final Student[] students1 = students;
        final int size = this.size;
        int i = 0;
        found:
        {
            for (; i < size; i++)
                if (student == students1[i])
                    break found;
                return  false;
        }
        fastRemove(students1, i);
        return true;
    }

    private void fastRemove(Student[] students, int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(students, i + 1, students, i, newSize - i);
        students[size = newSize] = null;
    }
}
