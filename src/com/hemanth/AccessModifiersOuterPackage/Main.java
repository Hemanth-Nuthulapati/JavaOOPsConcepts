package com.hemanth.AccessModifiersOuterPackage;

import com.hemanth.accessModifier.A;

public class Main extends A{
    public Main(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        Main main = new Main(12, "ragnarok");
        System.out.println(main.num);
    }
}

