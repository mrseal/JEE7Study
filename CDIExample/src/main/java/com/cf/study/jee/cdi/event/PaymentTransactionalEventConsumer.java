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

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentTransactionalEventConsumer {

    Logger logger = LoggerFactory.getLogger(getClass());

    public void receiveCreditBeforeCompletion(@Observes(during = TransactionPhase.BEFORE_COMPLETION) @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by BEFORE_COMPLETION Consumer");
    }

    public void receiveDebitBeforeCompletion(@Observes(during = TransactionPhase.BEFORE_COMPLETION) @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by BEFORE_COMPLETION Consumer");
    }

    public void receiveCreditAfterCompletion(@Observes(during = TransactionPhase.AFTER_COMPLETION) @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by AFTER_COMPLETION Consumer");
    }

    public void receiveDebitAfterCompletion(@Observes(during = TransactionPhase.AFTER_COMPLETION) @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by AFTER_COMPLETION Consumer");
    }

    public void receiveCreditAfterSuccess(@Observes(during = TransactionPhase.AFTER_SUCCESS) @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by AFTER_SUCCESS Consumer");
    }

    public void receiveDebitAfterSuccess(@Observes(during = TransactionPhase.AFTER_SUCCESS) @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by AFTER_SUCCESS Consumer");
    }

    public void receiveCreditAfterFailure(@Observes(during = TransactionPhase.AFTER_FAILURE) @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by AFTER_FAILURE Consumer");
    }

    public void receiveDebitAfterFailure(@Observes(during = TransactionPhase.AFTER_FAILURE) @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by AFTER_FAILURE Consumer");
    }

}
