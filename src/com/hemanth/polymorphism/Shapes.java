package com.hemanth.polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in Shapes!!!");
    }

    //Early binding:- when ever you try to override a final method, then compiler throws an
    // at the compile time. This is called as early binding
    final void greeting(){
        System.out.println("This method cannot be overridden");
    }
}

// below code can be example of early binding
//class RandomShape extends Shapes{
//    @Override
//    void greeting(){
//        System.out.println("trying to override final method");
//    }
//}

