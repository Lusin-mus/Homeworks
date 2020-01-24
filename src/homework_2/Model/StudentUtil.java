package com.company.Model;

import java.util.ArrayList;

public class StudentUtil {
    private CustomArrayList arrayListOfStudents = new CustomArrayList();
    private DoubleLinkedList doubleLinkedListOfStudents = new DoubleLinkedList();

    public void initArrayList(Student... students) {
        for (int i = 0; i < students.length; i++) {
            arrayListOfStudents.add(students[i]);
        }
        printInitializedArrayList(arrayListOfStudents);
    }

    public void initLinkedList(Student... students) {
        for (int i = 0; i < students.length; i++) {
            doubleLinkedListOfStudents.addLast(students[i]);
        }
        doubleLinkedListOfStudents.print();
    }

    public void printInitializedArrayList(CustomArrayList arrayList){
        for (int j=0; j<arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }
    }
}
