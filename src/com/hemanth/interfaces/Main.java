package com.hemanth.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brake();
        car.start();
        car.stop();
        car.accelerate();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.accelerate();
        niceCar.startMusic();
        niceCar.stopMusic();

    }
}
