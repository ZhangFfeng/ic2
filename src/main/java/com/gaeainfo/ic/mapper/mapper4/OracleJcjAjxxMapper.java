package com.gaeainfo.ic.mapper.mapper4;

import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.Jdjcjl;
import com.gaeainfo.ic.entity.UserTest;
import com.gaeainfo.ic.entity.Wfxw;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface OracleJcjAjxxMapper {

    List<JcjAjxx> getAll();
    void save(JcjAjxx jcjAjxx);
    void saveAll(List<JcjAjxx> list);

    void saveJdjcjl(Jdjcjl jdjcjl);
    void saveAllJdjcjl(List<Jdjcjl> list);

    void saveWfxw(Wfxw wfxw);
    void saveAllWfxw(List<Wfxw> list);

    void saveAllUser(List<UserTest> list);


}