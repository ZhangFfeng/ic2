package com.gaeainfo.ic.service;

import com.gaeainfo.ic.entity.UserTest;
import com.gaeainfo.ic.mapper.mapper4.OracleJcjAjxxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private OracleJcjAjxxMapper oracleJcjAjxxMapper;

    @Autowired
    @Qualifier("forthTransactionManager")
    private DataSourceTransactionManager txmanager;

    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "forthTransactionManager")
    public void saveData() throws Exception {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = txmanager.getTransaction(def);

            UserTest userTest = new UserTest();
            userTest.setId("1");
            userTest.setName("jimimimimimi");
            List<UserTest> list = new ArrayList<>();
            list.add(userTest);
            oracleJcjAjxxMapper.saveAllUser(list);

            txmanager.commit(status);
        /**
         * 将异常抛出即可，事务不会提交，抛出给controller处理
         */
//            int a = 3 / 0;
//            txmanager.rollback(status);



    }
}
