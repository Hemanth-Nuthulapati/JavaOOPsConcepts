package com.hemanth.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(15);
        son.partner();
        son.message();

        Parent child = new Daughter(18);
        child.partner();
        child.message();
        // if you try to create abstract parent class's instance(i.e., object)
        // then it will throw an error to override those abstract methods or to implement them.
//        Parent parent = new Parent() {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        }
    }
}
