package com.hemanth.enumExample;
// Enum is the special type of class that represents ta group of constants (like final variable)
//To create an enum, use enum keyword instead of class or interface, and separate the constants
//with a comma, note that they should be in uppercase
public enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    // these are enum constants
    // public, static and final by default
    //since it is final you cannot create child enums
    //the type of the enum is Week

    Week() {
        System.out.println("constructor called for " + this);
    }
}

class MiniMain{
    public static void main(String[] args) {
        Week week;
        week = Week.MONDAY;
//        System.out.println(week.ordinal()); // this will print the index

//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
    }
}
