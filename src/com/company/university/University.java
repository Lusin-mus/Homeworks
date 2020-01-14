package com.company.university;

import com.company.faculty.Faculty;
import com.company.group.Group;
import com.company.student.Student;
import com.company.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class University {
    private static University single_instance;

    private List<Faculty> faculties = new ArrayList<>();

    private static final String UNIVERSITY_NAME = "Sorbonne";

    private University() {
        System.out.println(UNIVERSITY_NAME);
    }

    public static University getInstance() {
        if (single_instance == null) {
            single_instance = new University();
        }
        return single_instance;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public double averageOfScoresOfSubjectForUniversity(Class<? extends Subject> subjectClass) throws Exception {
        if (getFaculties().size() == 0) {
            throw new Exception("University should have at least one faculty.");
        }
        double average;
        double sumOfScores = 0;
        int count = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    for (Subject subject : student.getSubjects()) {
                        if (subject.getClass().equals(subjectClass)) {
                            sumOfScores += subject.getScore();
                            count++;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            throw new Exception("There was no subject found for subject with class name: " + subjectClass.getName());
        }
        average = sumOfScores / count;
        return average;
    }
}
