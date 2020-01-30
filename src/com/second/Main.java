package com.second;

import com.second.collection.CustomArrayList;
import com.second.collection.DoubleLinkedList;
import com.second.collection.StudentUtil;
import com.second.model.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna", "Danielyan", 16));
        students.add(new Student("Anna", "Karapetuyan", 17));
        students.add(new Student("Anna", "Tovmassyan", 18));
        students.add(new Student("Roland", "Barseghyan", 16));

        System.out.println("Sorting students by firstName, then by age in descending order ");
        Comparator<Student> compareStudentByFirstNameThenByAgeInDescendingOrder
        = Comparator.comparing(Student::getFirstName)
        .thenComparing(Student::getAge, Comparator.reverseOrder());
        Collections.sort(students,compareStudentByFirstNameThenByAgeInDescendingOrder);
        printStudents(students);

        System.out.println();
        Collections.sort(students);
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


        System.out.println("Initialize arrayList and display");
        StudentUtil studentUtil1=new StudentUtil();
        studentUtil1.initArrayList();
        System.out.println();

        System.out.println("Initialize linkedlist and display");
        StudentUtil studentUtil12= new StudentUtil();
        studentUtil12.initLinkedList();


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