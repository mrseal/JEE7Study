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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentEventConsumer {

    Logger logger = LoggerFactory.getLogger(getClass());

    public void receiveCredit(@Observes @Credit final PaymentEvent event) {
        logger.info("[Credit] Event received by Normal Consumer");
    }

    public void receiveDebit(@Observes @Debit final PaymentEvent event) {
        logger.info("[Debit] Event received by Normal Consumer");
    }

}
