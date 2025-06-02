package com.hemanth.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("started Playing Music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing Music");
    }
}
