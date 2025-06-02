package com.hemanth.polymorphism;

//Method overloading or static polymorphism or compile time polymorphism
public class Numbers {
    double sum(double a, int b){
        return a + b;
    }
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    String sum(String str, int b){
        return str + b;
    }
    String sum(int a, String str){
        return a + str;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.sum(2.0, 2000));
        System.out.println(numbers.sum(2, 23));
        System.out.println(numbers.sum(12, 30, 63432));
        System.out.println(numbers.sum("Hemanth", 7));
        System.out.println(numbers.sum(70, "Hemanth"));
    }
}
