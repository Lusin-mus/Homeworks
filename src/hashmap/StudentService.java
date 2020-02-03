package hashmap;

import java.util.ArrayList;
import java.util.EnumMap;
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

    EnumMap getCountOfStudentsInFaculties(ArrayList<Student> students) {
       EnumMap<Faculties, Integer> numberOfStudentsInEachFaculty = new EnumMap<>(Faculties.class);
        for (Student student : students) {
            Integer countOfStudentsInFaculties = numberOfStudentsInEachFaculty.get(student.getFaculty());
            numberOfStudentsInEachFaculty.put(student.getFaculty(), (countOfStudentsInFaculties == null) ?
                    1 : countOfStudentsInFaculties + 1);
        }
        return numberOfStudentsInEachFaculty;
    }
}
