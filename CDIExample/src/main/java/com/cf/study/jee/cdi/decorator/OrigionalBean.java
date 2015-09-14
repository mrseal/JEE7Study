package com.cf.study.jee.cdi.decorator;

public class OrigionalBean implements Origional {

    @Override
    public String getString() {
        return "Hello";
    }
}
