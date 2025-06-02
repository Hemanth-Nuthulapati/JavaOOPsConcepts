package com.hemanth.singleton;

public class Main {
    public static void main(String[] args) {
        //SingletonClass obj = new SingletonClass();
        //the above will give you error, because SingletonClass's constructor does not allow
        // us to create instance of a class

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj3));
        // from above, we can say that all the reference variables are pointing to same object

    }
}
