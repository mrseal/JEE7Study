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

import javax.annotation.PostConstruct;

import org.slf4j.Logger;

public class ParentBean {

    Logger logger;

    @PostConstruct
    public void init() {
        logger.info("@PostConstruct of ParentBean");
    }

}
