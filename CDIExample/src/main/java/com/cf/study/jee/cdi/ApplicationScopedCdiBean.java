package com.cf.study.jee.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopedCdiBean {

    public String print() {
        return "@ApplicationScoped CDI Bean";
    }

}
