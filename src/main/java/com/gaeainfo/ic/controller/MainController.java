package com.gaeainfo.ic.controller;


import com.gaeainfo.aa.service.ServiceFind;
import com.gaeainfo.ic.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    public TestService testService;
    @Autowired
    public ServiceFind serviceFind;


    @RequestMapping("testTranstation")
    public String test() {
        try {
            testService.saveData();
            serviceFind.test();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("3232323");
        return "9999";
    }

}
