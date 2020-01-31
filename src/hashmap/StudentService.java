package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

class StudentService {
    HashMap getStudentsMap(ArrayList<Student> studentsList) {
        HashMap<Student, Integer> studentsOccurrences = new HashMap<>();
        for (Student student : studentsList) {
            Integer numberOfOccurrencesOfStudents = studentsOccurrences.get(student);
            studentsOccurrences.put(student, (numberOfOccurrencesOfStudents == null) ?
                    1 : numberOfOccurrencesOfStudents + 1);
        }
        return studentsOccurrences;
    }

    HashMap getCountOfStudentsInFaculties(ArrayList<Student> students) {
        HashMap<String, Integer> numberOfStudentsInEachFaculty = new HashMap<>();
        for (Student student : students) {
            Integer countOfStudentsInFaculties = numberOfStudentsInEachFaculty.get(student.getFacultyName());
            numberOfStudentsInEachFaculty.put(student.getFacultyName(), (countOfStudentsInFaculties == null) ?
                    1 : countOfStudentsInFaculties + 1);
        }
        return numberOfStudentsInEachFaculty;
    }
}
