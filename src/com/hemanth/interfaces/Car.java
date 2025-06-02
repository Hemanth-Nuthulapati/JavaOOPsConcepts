package com.hemanth.interfaces;

public class Car implements Brake, Engine, Media{

    int a = 10;
    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like engine like a normal car ");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
}
