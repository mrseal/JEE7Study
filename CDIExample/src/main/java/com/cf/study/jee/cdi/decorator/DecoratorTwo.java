package com.cf.study.jee.cdi.decorator;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION + 10)
// @Priority is new in Java EE 7. No need to define decorator in beans.xml in
// case @Priority is used.
public class DecoratorTwo implements Origional {

    @Inject
    @Delegate
    @Any
    Origional origional;

    @Override
    public String getString() {
        return "DecoratorTwo [" + origional.getString() + "]";
    }

}
