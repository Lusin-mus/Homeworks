package com.set;


import com.set.models.Coffee;
import com.set.models.Glass;
import com.set.models.Student;


public class Main {
    /**
     * Tests the SortedSet generic class methods using Student, Coffee and Glass generic classes.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        //Testing methods of SortedSet class on the Glass class

        SortedSet glasses = new SortedSet();
        Glass glass = new Glass("Escimo", 200);
        Glass glass1 = new Glass("Escimo", 200);
        Glass glass2 = new Glass("Jambo", 200);
        Glass glass3 = new Glass("Vanilla", 250);
        glasses.add(glass);
        glasses.add(glass1);
        glasses.add(glass2);
        glasses.add(glass3);
        glasses.print();
        glasses.contains(glass2);
        System.out.println(glasses.getSize());
        glasses.remove(glass2);
        glasses.print();
        System.out.println();

        //Testing methods of SortedSet class on the Student class

        SortedSet students = new SortedSet();
        Student student1 = new Student("Aram", "Petrosyan", 21);
        Student student2 = new Student("Aram", "Petrosyan", 21);
        Student student3 = new Student("Ani", "Amaryan", 22);
        Student student4 = new Student("Ani", "Safaryan", 21);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.print();
        System.out.println(students.getSize());
        students.contains(student4);
        students.contains(student2);
        students.remove(student1);
        students.print();
        System.out.println(students.getSize());
        System.out.println();

        //Testing methods of SortedSet class on the Coffee class

        SortedSet coffees = new SortedSet();
        Coffee coffee1 = new Coffee("Jazve", 800);
        Coffee coffee2 = new Coffee("Paris5", 750);
        Coffee coffee3 = new Coffee("Jacobs", 900);
        coffees.add(coffee1);
        coffees.add(coffee2);
        coffees.add(coffee3);
        coffees.remove(coffee3);
        coffees.print();
        System.out.println(coffees.getSize());
        coffees.contains(coffee3);

    }
}
