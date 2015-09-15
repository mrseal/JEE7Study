/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.cf.study.jee.cdi.producer.instance;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessionScopedBean implements Serializable {

    private static final long serialVersionUID = -7001565590082032666L;

    public SessionScopedBean print() {
        return this;
    }

}
