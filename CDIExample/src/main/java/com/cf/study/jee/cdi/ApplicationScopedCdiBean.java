package com.cf.study.jee.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationScopedCdiBean {

    @Inject
    private RequestScopedCdiBean requestScopedBean;

    public String print() {
        return "@ApplicationScoped CDI Bean";
    }

    public String get() {
        return "@RequestScoped Bean inside @ApplicationScoped Bean: " + requestScopedBean + " - " + requestScopedBean.print();
    }

}
