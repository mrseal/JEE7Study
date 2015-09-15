package com.cf.study.jee.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

/**
 * Beans that use session, application, or conversation scope must be serializable, but beans that use request scope do not have to be serializable.
 */
@SessionScoped
public class SessionScopedCdiBean implements Serializable {

    private static final long serialVersionUID = -8055305877191942931L;

    public String print() {
        return "@SessionScoped CDI Bean";
    }

}
