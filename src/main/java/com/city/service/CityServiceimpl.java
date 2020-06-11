package com.city.service;

import com.city.dao.Citymapper;
import com.city.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceimpl implements CityService {

    @Autowired
    Citymapper cityDao;

    @Override
    public List<City> queryUserlist() {
        return cityDao.queryUserlist();
    }

    @Override
    public void sava(City city) {
        cityDao.sava(city);
    }

    @Override
    public void update(City city) {
        cityDao.update(city);
    }

    @Override
    public City queryOne(int id) {
        return cityDao.queryOne(id);
    }

    @Override
    public void delect(int id) {
        cityDao.delect(id);
    }


}
