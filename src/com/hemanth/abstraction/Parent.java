package com.hemanth.abstraction;

// if you want to create an abstract class then you have to use "abstract" Keyword in the class
// declaration, like show below
public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 230434;
    }
    //Below are the non-abstract methods
    static void greeting(){
        System.out.println("Hello!!!");
    }

    void message(){
        System.out.println("message here...");
    }
    // Abstract class can have both non-abstract methods and abstract methods
    //non-abstract methods like shown in above methods ( greeting(), message() )
    //abstract methods can be declared like below
    //abstract methods are the only methods which are only declared without any implementation
    abstract void career();
    abstract void partner();

}
