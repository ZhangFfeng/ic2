package com.gaeainfo.ic.service;

import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.UserTest;
import com.gaeainfo.ic.mapper.mapper3.PostgreJcjAjxxMapper;
import com.gaeainfo.ic.mapper.mapper4.OracleJcjAjxxMapper;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.PostConstruct;
import java.applet.AppletContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private OracleJcjAjxxMapper oracleJcjAjxxMapper;
    @Autowired
    private PostgreJcjAjxxMapper postgreJcjAjxxMapper;

    @Autowired
    @Qualifier("thirdTransactionManager")
    private DataSourceTransactionManager txmanager;

    @Autowired
    ApplicationContext context;

    private TestService sss;

    @PostConstruct
    public void ssss() {
        this.sss = context.getBean(TestService.class);
    }


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

    @Override
    public List<JcjAjxx> testCacheData() {
//        List<UserTest> list= new ArrayList<>();
//        for(int i=0;i<10000;i++)
//        {
//            UserTest userTest = new UserTest();
//            userTest.setId(Math.random()*100+"");
//            userTest.setName(Math.random()*10+"");
//            list.add(userTest);
//        }
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = txmanager.getTransaction(def);

        List<JcjAjxx> list = postgreJcjAjxxMapper.getAll();
        System.out.println("更新之前" + list.size());
        JcjAjxx jcjAjxx = new JcjAjxx();
        jcjAjxx.setId("11111111111");
        jcjAjxx.setJlzt("222");
        List<JcjAjxx> list1 = new ArrayList<>();
        list1.add(jcjAjxx);
        postgreJcjAjxxMapper.saveAll(list1);
        txmanager.commit(status);

        List<JcjAjxx> list2 = postgreJcjAjxxMapper.getAll();
        System.out.println("更新之后" + list2.size());

        return list2;
    }

    /**
     * 定时器缓存跑查询~~~~更新缓存
     *
     * @return
     */
    @Override
    @Cacheable(value = "myCache", key = "'test1'")
    public List<JcjAjxx> test1() {
        List<JcjAjxx> list = postgreJcjAjxxMapper.getAll();
        System.out.println("service===" + list.size());
        return list;
    }

    @Override
    @CachePut(value = "myCache", key = "'test1'")
    public List<JcjAjxx> test2() {
        JcjAjxx jcjAjxx = new JcjAjxx();
        jcjAjxx.setId("!!!!" + new Date());
        jcjAjxx.setJlzt("222");
        List<JcjAjxx> list1 = new ArrayList<>();
        list1.add(jcjAjxx);
        postgreJcjAjxxMapper.saveAll(list1);
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = txmanager.getTransaction(def);
        txmanager.commit(status);
/**
 * 代理类~~~查询缓存
 * 代码层面增删改查
 */
        List<JcjAjxx> list22 = sss.test1();
        list22.add(jcjAjxx);


        System.out.println("test2~~~~" + list22.size());
        return list22;

    }

}
