package com.company.student;

import com.company.group.Group;
import com.company.subject.*;

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

        public SubjectBuilder addEnglish(int score) throws Exception {
            subjects.add(new English(score));
            return this;
        }

        public SubjectBuilder addFrench(int score) throws Exception {
            subjects.add(new French(score));
            return this;
        }

        public SubjectBuilder addGerman(int score) throws Exception {
            subjects.add(new German(score));
            return this;
        }

        public SubjectBuilder addArt(int score) throws Exception {
            subjects.add(new Art(score));
            return this;
        }

        public SubjectBuilder addForeignLiterature(int score) throws Exception {
            subjects.add(new ForeignLiterature(score));
            return this;
        }

        public SubjectBuilder addHistory(int score) throws Exception {
            subjects.add(new History(score));
            return this;
        }

        public SubjectBuilder addMathematics(int score) throws Exception {
            subjects.add(new Mathematics(score));
            return this;
        }

        public SubjectBuilder addPhilosophy(int score) throws Exception {
            subjects.add(new Philosophy(score));
            return this;
        }

        public SubjectBuilder addProbabilityAndStatistics(int score) throws Exception {
            subjects.add(new ProbabilityAndStatistics(score));
            return this;
        }

        public SubjectBuilder addAppliedMathematics(int score) throws Exception {
            subjects.add(new AppliedMathematics(score));
            return this;
        }

        public SubjectBuilder addTheoreticalComputerScience(int score) throws Exception {
            subjects.add(new TheoreticalComputerScience(score));
            return this;
        }

        public SubjectBuilder addTheoryOfAlgorithms(int score) throws Exception {
            subjects.add(new TheoryOfAlgorithms(score));
            return this;
        }

        public Student build() throws Exception {
            Student student = new Student();
            student.subjects = this.subjects;
            if (student.subjects.size() == 0) {
                throw new Exception("Student has no subject");
            }
            return student;
        }
    }

    public double averageOfStudentScores() {
        double average;
        double sum = 0;
        int count = 0;
        for (Subject subject : subjects) {
            sum = sum + subject.getScore();
        }
        average = sum / (subjects.size());
        return average;
    }
}
