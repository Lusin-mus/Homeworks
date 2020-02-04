package com.hashmap;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Diana", "Asatryan", 32,
                "0922111111", Faculties.PHYSICS));
        studentArrayList.add(new Student("Elen", "Mirzoyan", 12,
                "0933333333", Faculties.ENGLISH));
        studentArrayList.add(new Student("Diana", "Asatryan", 21,
                "0938111111", Faculties.PHILOSOPHY));
        studentArrayList.add(new Student("Karen", "Balayan", 12,
                "0977777777", Faculties.MATH));
        studentArrayList.add(new Student("Diana", "Asatryan", 22,
                "0988111111", Faculties.MATH));
        studentArrayList.add(new Student("Karen", "Balayan", 23,
                "098888811", Faculties.PHILOSOPHY));

        StudentService studentService = new StudentService();
        System.out.println("Number of students occurrences");
        printMap(studentService.getStudentsMap(studentArrayList));
        System.out.println();

        System.out.println("Number of students in each faculty");
        printMap(studentService.getCountOfStudentsInFaculties(studentArrayList));

    }

    private static void printMap(Map<Student, Integer> map) {
        for (Map.Entry<Student, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
    }
}
