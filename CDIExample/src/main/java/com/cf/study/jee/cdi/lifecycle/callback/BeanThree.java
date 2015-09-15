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
import org.slf4j.LoggerFactory;

public class BeanThree extends ParentBean {

    Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void initThree() {
        logger.info("@PostConstruct of BeanThree");
    }

    public void hello() {

    }

}
