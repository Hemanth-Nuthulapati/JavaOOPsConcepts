package com.hemanth.abstraction;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void partner() {
        System.out.println("I love Lufyy");
    }

    @Override
    void career() {
        System.out.println("I want to become an Independent women");
    }
}
