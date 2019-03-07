package com.gaeainfo.ic.mapper.mapper1;

import com.gaeainfo.ic.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface UserMapper1 {
    List<User> findAll();

    User findOne(Integer id);

    void addOne(User user);

    void updateOne(User user);

    void delOne(Integer id);
}
