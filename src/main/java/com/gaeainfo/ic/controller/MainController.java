package com.gaeainfo.ic.controller;


import com.gaeainfo.aa.service.ServiceFind;
import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.UserTest;
import com.gaeainfo.ic.service.TestService;
import net.sf.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {


    @Autowired
    public TestService testService;
    @Autowired
    public ServiceFind serviceFind;


    @RequestMapping("/testTranstation/{name}")
    public String test(@PathVariable("name") String name) {
//        try {
//            testService.saveData();
//            serviceFind.test();
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        System.out.println(name);
        return "9999";
    }

    @RequestMapping("/testTranstation2/{id}")
    public String test2(@RequestParam("name") String name) {
        System.out.println(name);
        return "9999";
    }

    @RequestMapping("/testCache")
    public String test3() {
        List<JcjAjxx> list = testService.testCacheData();
        System.out.println("size===" + list.size());
        return "succesCache";
    }

    @RequestMapping("/testCache2")
    public String test4() {
        List<JcjAjxx> list = testService.test1();
        System.out.println(list.size());

        return "succesCache";
    }

    @RequestMapping("/testCache3")
    public String test5() {
        testService.test2();
        System.out.println("controller~~~testCache3~~~~");

        return "succesCache";
    }
}
