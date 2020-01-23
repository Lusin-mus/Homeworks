package com.company.model;

import com.company.model.subject.Subject;
import com.company.model.subject.impl.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private Group group;
    private List<Subject> subjects = new ArrayList<>();

    private Student() {
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public static class SubjectBuilder {
        private List<Subject> subjects = new ArrayList<>();

        public SubjectBuilder addEnglish() {
            subjects.add(new English());
            return this;
        }

        public SubjectBuilder addFrench() {
            subjects.add(new French());
            return this;
        }

        public SubjectBuilder addGerman() {
            subjects.add(new German());
            return this;
        }

        public SubjectBuilder addArt() {
            subjects.add(new Art());
            return this;
        }

        public SubjectBuilder addForeignLiterature() {
            subjects.add(new ForeignLiterature());
            return this;
        }

        public SubjectBuilder addHistory() {
            subjects.add(new History());
            return this;
        }

        public SubjectBuilder addMathematics() {
            subjects.add(new Mathematics());
            return this;
        }

        public SubjectBuilder addPhilosophy() {
            subjects.add(new Philosophy());
            return this;
        }

        public SubjectBuilder addProbabilityAndStatistics() {
            subjects.add(new ProbabilityAndStatistics());
            return this;
        }

        public SubjectBuilder addAppliedMathematics() {
            subjects.add(new AppliedMathematics());
            return this;
        }

        public SubjectBuilder addTheoreticalComputerScience() {
            subjects.add(new TheoreticalComputerScience());
            return this;
        }

        public SubjectBuilder addTheoryOfAlgorithms() {
            subjects.add(new German());
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.subjects = this.subjects;
            return student;
        }
    }

    public void addNewSubjectToArrayList(Class<? extends Subject> subjectClass) throws Exception {
        for(int i=0; i<getSubjects().size(); i++){
            if (getSubjects().get(i).getClass().equals(subjectClass)) {
            return;
            }
        }
        Class<?> clazz = Class.forName(subjectClass.getName());
        Object newSubject = clazz.getConstructor().newInstance();
        getSubjects().add((Subject) newSubject);
    }

    public double averageOfStudentScores() throws Exception {
        if (subjects.size() == 0) {
            throw new Exception("Student has no subject");
        }
        double average;
        double sum = 0;
        for (Subject subject : subjects) {
            sum = sum + subject.getScore();
        }
        average = sum / (subjects.size());


        return average;
    }
}
