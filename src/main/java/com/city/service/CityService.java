package com.city.service;

import com.city.pojo.City;

import java.util.List;

public interface CityService {

    List<City> queryUserlist();

    void sava(City city);

    void update(City city);

    City queryOne(int id);

    void delect(int id);

}
