package com.set.models;

import java.util.Comparator;
import java.util.Objects;
/**
 * This generic class implements Comparable interface
 * The class has tree private fields: firstName, lastName and age
 * The class has constructor, getter and setter methods
 * toString(), equals(), hashCode() and compareTo() methods are overridden
 * @param  </Student> the type of elements of this class
 * @see java.util.SortedSet interface
 */
public class Student implements Comparable <Student>{
    private String firstName;
    private String lastName;
    private int age;


    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + ' ' + age+ ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    /**
     * This method compares elements at first according to the firstName
     * then by the lastName ant in the end by age and returns the result
     * @param o the element of this class type which receives the method
     * and compare with other elements of the same type
     * @return compared and sorted elements by all fields
     */

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getFirstName)
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getAge)
                .compare(this, o);
    }
}
