package com.nsv.jsmbaba.creational.singletonpattern;


public class SingleObject {
    public static SingleObject instance = new SingleObject();

    //private constructor
    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    void showMessage(){
        System.out.println("Singleton-> private constructor + static instance of itself");
    }
}
