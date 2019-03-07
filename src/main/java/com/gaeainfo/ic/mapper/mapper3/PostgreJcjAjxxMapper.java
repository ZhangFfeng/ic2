package com.gaeainfo.ic.mapper.mapper3;

import com.gaeainfo.ic.entity.JcjAjxx;
import com.gaeainfo.ic.entity.Jdjcjl;
import com.gaeainfo.ic.entity.UserTest;
import com.gaeainfo.ic.entity.Wfxw;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface PostgreJcjAjxxMapper {

    List<JcjAjxx> getAll();

    List<JcjAjxx> getAllByTime(String str);

    /**
     * 获取str之后的数据
     * @param str 时间
     * @return JcjAjxx
     */
    List<JcjAjxx> getAllByTimeAsc(String str);
    /**
     * 获取str之前的数据
     * @param str 时间
     * @return JcjAjxx
     */
    List<JcjAjxx> getAllByTimeDesc(String str);

    /**
     * 检查结束时间之前的所有记录
     * @param jcjstime 检查结束时间
     * @return Jdjcjl
     */
    List<Jdjcjl> getAllJdjcjlByJcjstimeDesc(String jcjstime);
    List<Jdjcjl> getAllJdjcjlByJcjstimeAsc(String jcjstime);

    List<Wfxw> getAllWfxwByJcdateDesc(String jcdate);
    List<Wfxw> getAllWfxwByJcdateAsc(String jcdate);

    Integer getCountOfWfxw(String jcdate);
    List<Wfxw> getWfxwByPage(@Param("jcdate") String jcdate, @Param("offset") int offset);

    void saveAllUser(List<UserTest> list);


}