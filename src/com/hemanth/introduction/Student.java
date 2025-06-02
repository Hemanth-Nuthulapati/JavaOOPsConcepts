package com.hemanth.introduction;

public class Student {
    int roll;
    String name;
    float marks ;

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("Hello!! I am " + this.name);
    }

    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
    Student(){
        this(0 , "Default_Name", 35.5f);
    }

    String changeName(String name){
        this.name = name;
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
