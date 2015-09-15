package com.cf.study.jee.cdi;

import javax.enterprise.context.RequestScoped;

/**
 * Beans that use session, application, or conversation scope must be serializable, but beans that use request scope do not have to be serializable.
 */
@RequestScoped
public class RequestScopedCdiBean {

    public String print() {
        return "@RequestScoped CDI Bean";
    }

}
