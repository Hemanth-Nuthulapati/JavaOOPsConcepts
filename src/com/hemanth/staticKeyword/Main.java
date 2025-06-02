package com.hemanth.staticKeyword;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(19, "Luffy", 3000000, false);
        Human h2 = new Human(21, "Zoro", 1110000, false);
        Human h3 = new Human(22, "sanji", 1010000, true);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());

        System.out.println(Human.population); // this is static variable
        Human.message();  // this is static method

        Main funn = new Main();
        funn.fun();

    }

    //static methods does not depend on objects
    static void fun(){
        System.out.println("Having fun!!!");

        //greeting(); //---> this we cannot do, non-static is being called in static method
        //hence, you cannot access non-static things in the static without creating an
        // instance of that class
        // here, I'm doing it... (in below)
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        System.out.println("Having Double FUN!!!!");
    }

    //we know that something that is non-static, belongs to an object
    void greeting(){
        fun2();
        System.out.println("GOOD MORNING!!!");
    }
}
