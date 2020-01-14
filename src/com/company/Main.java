package com.company;

import com.company.faculty.Faculty;
import com.company.faculty.FacultyFactory;
import com.company.group.Group;
import com.company.student.Student;
import com.company.subject.English;
import com.company.subject.Mathematics;
import com.company.subject.TheoreticalComputerScience;
import com.company.university.University;

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

                try {
                    Student student1 = new Student.SubjectBuilder()
                            .addEnglish(8)
                            .addHistory(4)
                            .addMathematics(6)
                            .addPhilosophy(7)
                            .addTheoreticalComputerScience(5)
                            .build();
                    student1.setFirstName("Ashot ");
                    student1.setLastName("Amaryan");
                    group1.getStudents().add(student1);
                    System.out.print("the average of scores is:");
                    System.out.println(student1.averageOfStudentScores());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println();
                    Student student2 = new Student.SubjectBuilder()
                            .addFrench(5)
                            .addHistory(7)
                            .addMathematics(3)
                            .addPhilosophy(5)
                            .addTheoreticalComputerScience(4)
                            .build();
                    student2.setFirstName("Armine ");
                    student2.setLastName("Karapetyan");
                    group1.getStudents().add(student2);
                    System.out.println("Average score of math for group by name: " + group1.getName() + " is " +
                            group1.averageOfScoresOfSameSubjectForGroup(Mathematics.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Average score of math for mathematics faculty is " +
                        mathematics.averageOfScoresOfSubjectForFaculty(English.class));

            } catch (Exception e) {
                e.printStackTrace();
            }
            Objects.requireNonNull(mathematics);
            university.getFaculties().add(mathematics);
            System.out.println("Average score of university for faculties is " +
                    university.averageOfScoresOfSubjectForUniversity(TheoreticalComputerScience.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}