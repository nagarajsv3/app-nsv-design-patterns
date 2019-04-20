package com.nsv.jsmbaba.creational.builderpattern;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String firstName;
    private String lastName;
}
