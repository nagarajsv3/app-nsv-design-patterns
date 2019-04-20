package com.nsv.jsmbaba.creational.builderpattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String type;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email= builder.email;
        this.type = builder.type;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String type;

        Builder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        Builder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        Builder atAge(int age){
            this.age=age;
            return this;
        }

        Builder withEmail(String email){
            this.email=email;
            return this;
        }

        Builder ofType(String type){
            this.type=type;
            return this;
        }

        User build(){
            User user = new User(this);
            return user;
        }
    }
}