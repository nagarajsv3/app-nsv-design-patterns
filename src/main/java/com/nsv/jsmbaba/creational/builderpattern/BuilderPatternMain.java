package com.nsv.jsmbaba.creational.builderpattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        User baba = new User.Builder()
                .withFirstName("Sai")
                .withLastName("Baba")
                .atAge(200)
                .withEmail("nagarajsv3@gmail.com")
                .ofType("God")
                .build();

        System.out.println(baba);

        Person babaL  = Person.builder()
                .firstName("Sai")
                .lastName("Baba")
                .build();
        System.out.println(babaL);
    }
}
