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
package com.cf.study.jee.cdi.event;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/event")
public class PaymentServlet extends HttpServlet {

    private static final long serialVersionUID = 2146676614366852375L;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    private PaymentEventProducer producer;

    //    @Inject
    //    private PaymentConditionalEventConsumer conditionalConsumer;

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
        //        conditionalConsumer.init();

        final String type = request.getParameter("type");
        if ("transactional".equals(type)) {
            producer.sendCreditEventWithinTransaction();
            logger.info("=====================");
            producer.sendDebitEventWithinTransaction();
        } else {
            producer.sendCreditEvent();
            logger.info("=====================");
            producer.sendDebitEvent();
        }
    }
}
