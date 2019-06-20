package com.nsv.jsmbaba.creational.factorypattern;

public class FactoryMain {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape triangle = ShapeFactory.getShape("triangle");
    }
}
