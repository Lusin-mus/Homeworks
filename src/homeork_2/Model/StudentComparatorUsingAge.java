package com.second.Model;

import java.util.Comparator;

public class StudentComparatorUsingAge implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getAge(), student1.getAge());
    }
}
