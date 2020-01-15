package com.company.model.faculty;

import com.company.model.Group;
import com.company.model.Student;
import com.company.model.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class Faculty {

    private List<Group> groups = new ArrayList<>();

    public abstract String getName() ;

    public List<Group> getGroups() {
        return groups;
    }

    public double averageOfScoresOfSubjectForFaculty(Class<? extends Subject> subjectClass) throws Exception {
        System.out.print("Average score of math for the " + getName());
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
