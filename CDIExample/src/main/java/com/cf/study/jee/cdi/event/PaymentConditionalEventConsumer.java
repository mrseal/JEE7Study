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

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Conditional observer method cannot be declared by a @Dependent scoped bean

@SessionScoped
public class PaymentConditionalEventConsumer implements Serializable {

    private static final long serialVersionUID = -2082837040026314425L;

    Logger logger = LoggerFactory.getLogger(getClass());

    public void init() {

    }

    public void receiveCredit(@Observes(notifyObserver = Reception.IF_EXISTS) @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by Conditional Consumer");
    }

    public void receiveDebit(@Observes(notifyObserver = Reception.IF_EXISTS) @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by Conditional Consumer");
    }

}
