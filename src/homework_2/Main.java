package com.company;

import com.company.Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna", "Danielyan", 20));
        students.add(new Student("Nelli", "Karapetuyan", 19));
        students.add(new Student("Arman", "Tovmassyan", 18));
        students.add(new Student("Roland", "Barseghyan", 16));

        Collections.sort(students, new StudentComparatorUsingFirstName());
        System.out.println("Sorting students by firstName in ascending order: ");
        printStudents(students);

        System.out.println();

        Collections.sort(students, new StudentComparatorUsingAge());
        System.out.println("Sorting students by age in descending order: ");
        printStudents(students);

        System.out.println();
        Collections.sort(students, Student::compareTo);
        System.out.println("Sorting students by lastName in ascending order: ");
        LinkedList<Student> linkedListOfStudents = new LinkedList<>(students);
        printStudentsFromLinkedList(linkedListOfStudents);


        System.out.println();
        System.out.println("Test ArrayList methods");
        CustomArrayList arrayListOfStudents=new CustomArrayList();
        Student student1=arrayListOfStudents.add(new Student("Gayane", "Saribekyan", 20));
        Student student2=arrayListOfStudents.add(new Student("Garik", "Daronyan", 18));
        Student student3=arrayListOfStudents.add(new Student("Sathenik", "Narinyan", 19));
        Student student4=arrayListOfStudents.add(new Student("Sona", "Martirosyan", 21));
        arrayListOfStudents.remove(student1);
        printInitializedArrayList(arrayListOfStudents);
        System.out.print("The size of array list: " + arrayListOfStudents.size()+"\n");
        System.out.println(arrayListOfStudents.get(1));

        System.out.println();
        System.out.println("Test linked list methods ");
        DoubleLinkedList doubleLinkedListOfStudents=new DoubleLinkedList();
        Student student5=doubleLinkedListOfStudents.push(new Student("Ani", "Karapetyan", 21));
        Student student6=doubleLinkedListOfStudents.push(new Student("Paruyr", "Vardanyan", 20));
        Student student7=doubleLinkedListOfStudents.push(new Student("Mihran", "Petrosyan", 20));
        doubleLinkedListOfStudents.addLast(student1);
        doubleLinkedListOfStudents.pop();
        doubleLinkedListOfStudents.removeLast();
        doubleLinkedListOfStudents.print();
        System.out.println();

        Student [] studentList=new Student[5];
        studentList[0]=new Student("Armen", "Araqelyan", 21);
        studentList[1]=new Student("Tigran", "Lalayan", 19);
        studentList[2]=new Student("Roland", "Tsaturyan", 20);
        studentList[3]=new Student("Karine", "Hovakimyan", 18);
        studentList[4]=new Student("Marine", "Gevorgyan", 22);


        System.out.println("Initialize arrayList and display");
        StudentUtil studentUtil1= new StudentUtil();
        studentUtil1.initArrayList(studentList);
        System.out.println();

        System.out.println("Initialize linkedlist and display");
        StudentUtil studentUtil12= new StudentUtil();
        studentUtil12.initLinkedList(studentList);


    }


    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + "age: " + student.getAge());
        }
    }

    public static void printStudentsFromLinkedList(LinkedList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + "age: " + student.getAge());
        }
    }
    public static void printInitializedArrayList(CustomArrayList arrayList){
        for (int j=0; j<arrayList.size(); j++){
            System.out.println(arrayList.get(j));
        }
    }

}