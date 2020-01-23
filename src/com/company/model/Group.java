package com.company.model;

import com.company.model.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }


    public List<Student> getStudents() {
        for (Student student : students) {
        }
        return students;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }


    public double averageOfScoresOfSameSubjectForGroup(Class<? extends Subject> subjectClass) {
        double average;
        double scoresSum = 0;
        int count = 0;
        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                if (subject.getClass().equals(subjectClass)) {
                    scoresSum += subject.getScore();
                    count++;
                }
            }
        }
        average = scoresSum / count;
        return average;
    }
}
