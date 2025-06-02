package com.hemanth.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey!!!");
    }

    //if any of the fields is private then we can get those values with getter method
    public double getL(){
        return l;
    }

    Box(){
        System.out.println("This called default constructor!!");
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //Cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        System.out.println("This called constructor with parameters!!");
        //super();
        // super is used to call the constructor of the immediate parent class
        //the default parent class of all the classes we create is Object class
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old){
        System.out.println("you have passes an old box in the instance - constructor");
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
