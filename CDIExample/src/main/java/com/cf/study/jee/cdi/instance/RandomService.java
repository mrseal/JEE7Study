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
package com.cf.study.jee.cdi.instance;

import java.io.IOException;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/instance")
public class RandomService extends HttpServlet {

    private static final long serialVersionUID = -1741120958421535880L;

    @Inject
    @Random
    private Instance<Integer> randomInt;

    @Inject
    private Instance<SessionScopedBean> sessionScopedBean;

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            response.getOutputStream().write((randomInt.get() + "<br/>").getBytes());
            response.getOutputStream().write(sessionScopedBean.get().print().toString().getBytes());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}
