package com.second.collection;
import com.second.model.Student;

import java.util.Iterator;

public class StudentUtil {
    private CustomArrayList arrayListOfStudents = new CustomArrayList();
    private DoubleLinkedList doubleLinkedListOfStudents = new DoubleLinkedList();



    public void initArrayList() {
            arrayListOfStudents.add(new Student("Armen", "Araqelyan", 21));
            arrayListOfStudents.add(new Student("Tigran", "Lalayan", 19));
            arrayListOfStudents.add(new Student("Roland", "Tsaturyan", 20));
            arrayListOfStudents.add(new Student("Karine", "Hovakimyan", 18));
            arrayListOfStudents.add(new Student("Marine", "Gevorgyan", 22));
            printInitializedArrayList(arrayListOfStudents);
    }

    public void initLinkedList() {
        doubleLinkedListOfStudents.addLast(new Student("Armen", "Araqelyan", 21));
        doubleLinkedListOfStudents.addLast(new Student("Tigran", "Lalayan", 19));
        doubleLinkedListOfStudents.addLast(new Student("Roland", "Tsaturyan", 20));
        doubleLinkedListOfStudents.addLast(new Student("Karine", "Hovakimyan", 18));
        doubleLinkedListOfStudents.addLast(new Student("Marine", "Gevorgyan", 22));
//        doubleLinkedListOfStudents.print();
        Iterator <Student> iterator=doubleLinkedListOfStudents.studentIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void printInitializedArrayList(CustomArrayList arrayList) {
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }
    }
}