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
package com.cf.study.jee.cdi.lifecycle.callback;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/callback")
public class Service extends HttpServlet {

    private static final long serialVersionUID = 3513514190938548126L;

    @Inject
    BeanOne beanOne;

    @Inject
    BeanTwo beanTwo;

    @Inject
    BeanThree beanThree;

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
        // Check the log file, and see the print of @PostConstruct
        beanOne.hello();
        beanTwo.hello();
        beanThree.hello();
    }

}
