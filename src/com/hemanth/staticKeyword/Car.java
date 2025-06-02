package com.hemanth.staticKeyword;

public class Car {
    String name;
    int price;
    static int totalCars;

    static{
        totalCars = 0;
        System.out.println("Car class loaded. Ready to manufacture!");
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        totalCars += 1;
        System.out.println("New Car Created: " + this.name + " - ₹" + this.price);
    }

    static void showroomStatus(){
        System.out.println("Total no. of cars created sofar are: " + Car.totalCars);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Swift", 600000);
        Car car2 = new Car("Scorpio", 1200000);
        Car car3 = new Car("Thar", 1400000);

        Car.showroomStatus();
    }

}
