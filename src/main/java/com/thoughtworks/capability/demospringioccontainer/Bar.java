package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Bar {

    private Foo foo;

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
