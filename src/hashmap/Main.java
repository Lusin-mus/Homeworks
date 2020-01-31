package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Diana", "Asatryan", 32,
                "0922111111", "Physics"));
        studentArrayList.add(new Student("Elen", "Mirzoyan", 12,
                "0933333333", "English"));
        studentArrayList.add(new Student("Diana", "Asatryan", 21,
                "0938111111", "Philosophy"));
        studentArrayList.add(new Student("Karen", "Balayan", 12,
                "0977777777", "Math"));
        studentArrayList.add(new Student("Diana", "Asatryan", 22,
                "0988111111", "Math"));
        studentArrayList.add(new Student("Karen", "Balayan", 23,
                "098888811", "Philosophy"));

        StudentService studentService = new StudentService();
        System.out.println("Number of students occurrences");
        printMap(studentService.getStudentsMap(studentArrayList));
        System.out.println();

        System.out.println("Number of students in each faculty");
        printMapOfFaculties(studentService.getCountOfStudentsInFaculties(studentArrayList));

    }


    private static void printMap(HashMap<Student, Integer> map) {
        for (HashMap.Entry<Student, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + " "
                    + entry.getValue());
        }
    }

    private static void printMapOfFaculties(HashMap<String, Integer> map) {
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
    }
}
