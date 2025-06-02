package com.hemanth.staticKeyword;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello world");
        //System.out.println(this.age);
        //the above commented line cannot be used here, because message() method is
        // a static method. a static method cannot access a non-static variable
        //there is a way to access a non-static thing in static i.e.,
        //creating an object of that particular class like shown below
        Human human = new Human();
        System.out.println(human.age);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population += 1;
    }

    public Human() {
        this.age = 0;
        this.name = "Default";
        this.salary = 0;
        this.married = false;
        population += 1;
    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
