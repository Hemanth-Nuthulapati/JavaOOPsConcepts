package com.hemanth.interfaces.extendDemo;

public class ImplementationClass implements B{

    @Override
    public void greet() {
        System.out.println("heyy!!! (in A)");
    }

    @Override
    public void message() {
        System.out.println("how are you??? (in B)");
    }
}
