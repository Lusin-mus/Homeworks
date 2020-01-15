package com.company.utils;

import com.company.model.faculty.Faculty;
import com.company.model.faculty.impl.LiteratureAndArt;
import com.company.model.faculty.impl.Mathematics;

public class FacultyFactory {
    public static Faculty getFaculty(String facultyName) throws Exception {
        if ("Mathematics".equalsIgnoreCase(facultyName)) {
            System.out.println("faculty of Mathematics");
            return new Mathematics();

        } else if ("LiteratureAndArt".equalsIgnoreCase(facultyName)) {
            System.out.println("faculty of Literature and Art");
            return new LiteratureAndArt();
        }
        throw new Exception("Faculty of the name " + facultyName + " has not found");
    }
}

