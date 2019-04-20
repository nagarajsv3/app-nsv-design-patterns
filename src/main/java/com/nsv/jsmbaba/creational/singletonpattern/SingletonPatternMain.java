package com.nsv.jsmbaba.creational.singletonpattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        System.out.println(object);
        object.showMessage();

        SingleObject object1 = SingleObject.getInstance();
        System.out.println(object1);
        object1.showMessage();
    }
}
