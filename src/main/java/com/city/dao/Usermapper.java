package com.city.dao;

import com.city.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface Usermapper {
    int sava(User user);

    void update(User user);
}
