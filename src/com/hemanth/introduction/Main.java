package com.hemanth.introduction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "baa", 85.3f);
        System.out.println(student.toString());
        student.greeting();

        Student student1 = new Student(7, "Hemanth", 99.9f);
        System.out.println("student1: " + student1.toString());

        Student student2 = student1;
        student2.name = "ramp";
        System.out.println("student2: " + student2.toString());

        Student defaultStudent = new Student();
        System.out.println(defaultStudent.toString());
        defaultStudent.changeName("default");
        System.out.println(defaultStudent.toString());

    }
}
