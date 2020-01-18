package com.company;

import com.company.model.Group;
import com.company.model.Student;
import com.company.model.University;
import com.company.model.faculty.Faculty;
import com.company.model.subject.impl.English;
import com.company.model.subject.impl.French;
import com.company.model.subject.impl.Mathematics;
import com.company.model.subject.impl.TheoreticalComputerScience;
import com.company.utils.FacultyFactory;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        try {
            University university = University.getInstance();
            System.out.println();
            System.out.println("The university has two faculties: ");
            Faculty mathematics = null;
            try {
                mathematics = FacultyFactory.getFaculty("Mathematics");
                Group group1 = new Group("Group1");

                mathematics.getGroups().add(group1);

                    Student student1 = new Student.SubjectBuilder()
                            .addEnglish()
                            .addHistory()
                            .addMathematics()
                            .addPhilosophy()
                            .addTheoreticalComputerScience()
                            .build();
                    student1.setFirstName("Ashot ");
                    student1.setLastName("Amaryan");
                    student1.getSubjects().get(0).setScore(6);
                    student1.getSubjects().get(1).setScore(6);
                    student1.getSubjects().get(3).setScore(6);
                    student1.getSubjects().get(4).setScore(6);
                    student1.getSubjects().get(2).setScore(6);
                    student1.addNewSubjectToArrayList(French.class);
                    student1.getSubjects().get(5).setScore(6);

                    group1.getStudents().add(student1);
                    try {
                        System.out.println("The average of student1 scores is: " + student1.averageOfStudentScores());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                System.out.println();
                Student student2 = new Student.SubjectBuilder()
                        .addFrench()
                        .addHistory()
                        .addMathematics()
                        .addPhilosophy()
                        .addTheoreticalComputerScience()
                        .build();
                student2.setFirstName("Armine ");
                student2.setLastName("Karapetyan");
                student2.getSubjects().get(0).setScore(10);
                student2.getSubjects().get(1).setScore(10);
                student2.getSubjects().get(3).setScore(10);
                student2.getSubjects().get(2).setScore(10);
                student2.getSubjects().get(4).setScore(10);
                student2.addNewSubjectToArrayList(English.class);
                student2.getSubjects().get(5).setScore(10);
                group1.getStudents().add(student2);
              try {
                  System.out.println("The average of student2 scores is: "+ student2.averageOfStudentScores());
              }
              catch (Exception e){
                  e.printStackTrace();
              }

                System.out.println("Average score of math for group by name: " + group1.getName() + " is " +
                        group1.averageOfScoresOfSameSubjectForGroup(Mathematics.class));
                System.out.println("English: " + mathematics.averageOfScoresOfSubjectForFaculty(English.class));

            } catch (Exception e) {
                e.printStackTrace();
            }
            Objects.requireNonNull(mathematics);
            university.getFaculties().add(mathematics);
            System.out.println("Average score of Theoretical Computer Science for the university is " +
                    university.averageOfScoresOfSubjectForUniversity(TheoreticalComputerScience.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}