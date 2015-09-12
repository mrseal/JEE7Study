package com.cf.study.jee.cdi;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScopedCdiBean {

    public String print() {
        return "@RequestScoped CDI Bean";
    }

}
