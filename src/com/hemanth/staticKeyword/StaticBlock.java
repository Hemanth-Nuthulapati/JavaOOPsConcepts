package com.hemanth.staticKeyword;

public class StaticBlock {
    static int a = 4;
    static int b;
    static int c;

    static {
        System.out.println("Static block is executed!! And value of 'c' is initialized");
        c = b + a;
    }

    static {
        System.out.println("Static block is executed!! And value of 'b' is initialized");
        b = a * 3;
    }

    public static void main(String[] args) {
        //StaticBlock staticBlock = new StaticBlock();
        System.out.println("a= " + StaticBlock.a);
        System.out.println("b= " + StaticBlock.b);
        System.out.println("c= " + StaticBlock.c);

        StaticBlock.b = b * 20;
        System.out.println("b= " + StaticBlock.b);
        StaticBlock.a = a * 20;

        System.out.println("a= " + StaticBlock.a);
        System.out.println("b= " + StaticBlock.b);
    }
}
