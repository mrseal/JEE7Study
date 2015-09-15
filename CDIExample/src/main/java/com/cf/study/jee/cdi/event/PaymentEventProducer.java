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

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class PaymentEventProducer {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    @Credit
    Event<PaymentEvent> creditEvent;

    @Inject
    @Debit
    Event<PaymentEvent> debitEvent;

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void sendCreditEvent() {
        logger.info("Firing Credit Event");
        creditEvent.fire(new PaymentEvent());
        logger.info("BEFORE_COMPLETION");
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void sendDebitEvent() {
        logger.info("Firing Debit Event");
        debitEvent.fire(new PaymentEvent());
        logger.info("BEFORE_COMPLETION");
    }

    public void sendCreditEventWithinTransaction() {
        logger.info("Firing Credit Event");
        creditEvent.fire(new PaymentEvent());
        logger.info("Transaction BEFORE_COMPLETION");
    }

    public void sendDebitEventWithinTransaction() {
        logger.info("Firing Debit Event");
        debitEvent.fire(new PaymentEvent());
        logger.info("Transaction BEFORE_COMPLETION");
        logger.info("Transaction FAILING");
        throw new RuntimeException();
    }

}
