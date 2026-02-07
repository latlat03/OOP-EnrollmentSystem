package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        Course course = new Course();

        System.out.print("Student ID: ");
        student.setStudentID(sc.nextLine());

        System.out.print("Student Name: ");
        student.setStudentName(sc.nextLine());

        System.out.print("Program: ");
        student.setProgram(sc.nextLine());

        System.out.print("Course ID: ");
        course.setCourseID(sc.nextLine());

        System.out.print("Course Name: ");
        course.setCourseName(sc.nextLine());

        System.out.print("Course Program: ");
        course.setProgram(sc.nextLine());

        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());

        System.out.println("\n--- COURSE DETAILS ---");
        System.out.println("Course ID: " + course.getCourseID());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Program: " + course.getProgram());
    }
}
