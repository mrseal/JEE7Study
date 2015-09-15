package com.cf.study.jee.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Beans that use session, application, or conversation scope must be serializable, but beans that use request scope do not have to be serializable.
 */
@ApplicationScoped
public class ApplicationScopedCdiBean implements Serializable {

    private static final long serialVersionUID = -8085986295803948682L;

    @Inject
    private RequestScopedCdiBean requestScopedBean;

    public String print() {
        return "@ApplicationScoped CDI Bean";
    }

    public String get() {
        return "@RequestScoped Bean inside @ApplicationScoped Bean: " + requestScopedBean + " - " + requestScopedBean.print();
    }

}
