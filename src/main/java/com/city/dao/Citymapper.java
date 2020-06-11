package com.city.dao;

import com.city.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;


@Mapper
@Repository
public interface Citymapper {

    List<City> queryUserlist();

    void sava(City city);

    void update(City city);

    City queryOne(int id);

    void delect(int id);

}
