package com.george.dev.aop_app.service;

import com.george.dev.aop_app.dao.AccountDAO;
import com.george.dev.aop_app.dao.MembershipDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService implements InitializingBean {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    private AccountDAO accountDAO;

    @Autowired
    private MembershipDAO membershipDAO;

    @Override
    public void afterPropertiesSet() throws Exception{
        startProcess();
    }

    public void startProcess(){
        logger.info("App Started");
        accountDAO.addAccount();

        secondProcess();
    }

    private void secondProcess() {
        logger.info("Running Membership DAO Object");
        membershipDAO.addAccount();
    }

}
