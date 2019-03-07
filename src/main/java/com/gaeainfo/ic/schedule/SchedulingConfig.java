package com.gaeainfo.ic.schedule;

import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.Jdjcjl;
import com.gaeainfo.ic.entity.Wfxw;
import com.gaeainfo.ic.mapper.mapper3.PostgreJcjAjxxMapper;
import com.gaeainfo.ic.mapper.mapper4.OracleJcjAjxxMapper;
import com.gaeainfo.ic.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Configuration
@EnableScheduling
@EnableAsync
public class SchedulingConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchedulingConfig.class);
    private final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final CommonUtil COMMONUTIL = new CommonUtil();
    @Autowired
    private PostgreJcjAjxxMapper postgreJcjAjxxMapper;
    @Autowired
    private OracleJcjAjxxMapper oracleJcjAjxxMapper;


    @Async
    @Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行一次
    public void getJcjAjxx() {
        Long l1 = System.currentTimeMillis();
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MINUTE, -10);
            String str = SDF.format(c.getTime());
            LOGGER.info("getJcjAjxx定时器开始时间" + str);
            List<JcjAjxx> list = postgreJcjAjxxMapper.getAllByTimeAsc(str);
            LOGGER.info("JcjAjxx list.size" + list.size());
            if (list.size() <= 0) {
                return;
            }
            if (list.size() < 100) {
                COMMONUTIL.saveJcjAjxx(list);
            } else {
                for (int i = 0; i < list.size() / 100; i++) {
                    List<JcjAjxx> listTemp = list.subList(i * 100, (i + 1) * 100);
                    COMMONUTIL.saveJcjAjxx(listTemp);
                }
                if (list.size() % 100 != 0) {
                    List<JcjAjxx> listTemp = list.subList(list.size() / 100 * 100, list.size());
                    COMMONUTIL.saveJcjAjxx(listTemp);
                }
            }
            LOGGER.info("getJcjAjxx总耗时" + (System.currentTimeMillis() - l1));

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
            LOGGER.error("getJcjAjxx总耗时" + (System.currentTimeMillis() - l1));
        }

    }

    @Async
    @Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行一次
    public void getJdjcjl() {
        Long l1 = System.currentTimeMillis();
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MINUTE, -10);
            String str = SDF.format(c.getTime());
            LOGGER.info("getJdjcjl定时器开始时间" + str);
            List<Jdjcjl> list = postgreJcjAjxxMapper.getAllJdjcjlByJcjstimeAsc(str);
            LOGGER.info("getJdjcjl list.size" + list.size());
            if (list.size() <= 0) {
                return;
            }
            if (list.size() < 100) {
                COMMONUTIL.saveJdjcjl(list);
            } else {

                for (int i = 0; i < list.size() / 100; i++) {
                    List<Jdjcjl> listTemp = list.subList(i * 100, (i + 1) * 100);
                    COMMONUTIL.saveJdjcjl(listTemp);
                }
                if (list.size() % 100 != 0) {
                    List<Jdjcjl> listTemp = list.subList(list.size() / 100 * 100, list.size());
                    COMMONUTIL.saveJdjcjl(listTemp);
                }
            }
            LOGGER.info("getJdjcjl总耗时" + (System.currentTimeMillis() - l1));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
            LOGGER.error("getJdjcjl总耗时" + (System.currentTimeMillis() - l1));

        }

    }

    @Async
    @Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行一次
    public void getWfxw() {
        Long l1 = System.currentTimeMillis();
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MINUTE, -10);
            String str = SDF.format(c.getTime());
            LOGGER.info("getWfxw定时器开始时间" + str);

            List<Wfxw> list = postgreJcjAjxxMapper.getAllWfxwByJcdateAsc(str);
            LOGGER.info("getWfxw list.size" + list.size());
            if (list.size() <= 0) {
                return;
            }
            if (list.size() < 100) {
                COMMONUTIL.saveWfxw(list);
            } else {

                for (int i = 0; i < list.size() / 100; i++) {
                    List<Wfxw> listTemp = list.subList(i * 100, (i + 1) * 100);
                    COMMONUTIL.saveWfxw(listTemp);
                }
                if (list.size() % 100 != 0) {
                    List<Wfxw> listTemp = list.subList(list.size() / 100 * 100, list.size());
                    COMMONUTIL.saveWfxw(listTemp);
                }
            }
            LOGGER.info("getWfxw总耗时" + (System.currentTimeMillis() - l1));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
            LOGGER.info("getWfxw总耗时" + (System.currentTimeMillis() - l1));
        }


    }

}
