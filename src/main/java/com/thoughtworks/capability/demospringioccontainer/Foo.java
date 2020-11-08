package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    @Autowired
    private Bar bar;

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
