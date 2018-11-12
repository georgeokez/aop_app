package com.george.dev.aop_app.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    public void addAccount(){
        logger.info("Adding a membership dao account");
    }

}
