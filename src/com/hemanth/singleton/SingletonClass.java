package com.hemanth.singleton;

public class SingletonClass {
    //you should not allow some instance to call the constructor that is why declared it as private
    private SingletonClass(){
        System.out.println("Singleton Instance is Created");
    }

    public static SingletonClass instance;

    public static SingletonClass getInstance() {
        if(instance == null){
            instance = new SingletonClass();
            //create the instance only if it does not exist
        }
        return instance;
    }
}
