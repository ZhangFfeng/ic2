package com.gaeainfo.ic.util;

import com.gaeainfo.ic.controller.MainController;
import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.Jdjcjl;
import com.gaeainfo.ic.entity.Wfxw;
import com.gaeainfo.ic.mapper.mapper3.PostgreJcjAjxxMapper;
import com.gaeainfo.ic.mapper.mapper4.OracleJcjAjxxMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CommonUtil {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private PostgreJcjAjxxMapper postgreJcjAjxxMapper;
    @Autowired
    private OracleJcjAjxxMapper oracleJcjAjxxMapper;
    public static CommonUtil commonUtil;

    @PostConstruct
    public void init() {
        commonUtil = this;
        commonUtil.oracleJcjAjxxMapper = this.oracleJcjAjxxMapper;
        commonUtil.postgreJcjAjxxMapper = this.postgreJcjAjxxMapper;
    }

    public void saveJcjAjxx(List<JcjAjxx> list) {
        try {
            commonUtil.oracleJcjAjxxMapper.saveAll(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            for (int j = 0; j < list.size(); j++) {
                try {
                    commonUtil.oracleJcjAjxxMapper.save(list.get(j));
                } catch (Exception e1) {
                    logger.error(e1.getMessage());
                }
            }
        }
    }

    public void saveJdjcjl(List<Jdjcjl> list) {
        try {
            commonUtil.oracleJcjAjxxMapper.saveAllJdjcjl(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            for (int j = 0; j < list.size(); j++) {
                try {
                    commonUtil.oracleJcjAjxxMapper.saveJdjcjl(list.get(j));
                } catch (Exception e1) {
                    logger.error(e1.getMessage());
                }
            }
        }
    }

    public void saveWfxw(List<Wfxw> list) {
        try {
            commonUtil.oracleJcjAjxxMapper.saveAllWfxw(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            for (int j = 0; j < list.size(); j++) {
                try {
                    commonUtil.oracleJcjAjxxMapper.saveWfxw(list.get(j));
                } catch (Exception e1) {
                    logger.error(e1.getMessage());
                }
            }
        }
    }
}
