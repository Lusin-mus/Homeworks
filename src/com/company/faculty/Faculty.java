package com.company.faculty;

import com.company.group.Group;
import com.company.student.Student;
import com.company.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private List<Group> groups = new ArrayList<>();


    public List<Group> getGroups() {
        return groups;
    }

    public double averageOfScoresOfSubjectForFaculty(Class<? extends Subject> subjectClass) throws Exception {
        if (groups.size() == 0) {
            throw new Exception("Faculty should have at least one group.");
        }
        double average;
        double sumOfScores = 0;
        int count = 0;
        for (Group group : getGroups()) {
            for (Student student : group.getStudents()) {
                for (Subject subject : student.getSubjects()) {
                    if (subject.getClass().equals(subjectClass)) {
                        sumOfScores += subject.getScore();
                        count++;
                    }
                }
            }
        }
        average = sumOfScores / count;
        return average;
    }
}
