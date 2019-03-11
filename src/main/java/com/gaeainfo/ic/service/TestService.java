package com.gaeainfo.ic.service;

import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.UserTest;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface TestService {
    void saveData() throws Exception;

    List<JcjAjxx> testCacheData();

    List<JcjAjxx> test1();

    List<JcjAjxx> test2();
}
