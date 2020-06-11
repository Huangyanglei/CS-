package com.city.controller;

import com.city.pojo.City;
import com.city.pojo.User;
import com.city.service.CityService;
import com.city.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class Citycontro {


    @Autowired
    CityService cityService;

    @Autowired
    UserService userService;

    @GetMapping("/useradd")
    public Boolean usersava( String name,String pwd) {
        User user = new User();
        user.setU_name(name);
        user.setU_pwd(pwd);
        int sava = userService.sava(user);
        if (sava == 0) {
            userService.update(user);
            return false;
        } else {
            return true;
        }
    }

    @GetMapping("/index")
    public List<City> index(){
        return cityService.queryUserlist();
    }

    @PostMapping("/sava")
    public void  sava(City city){
        cityService.sava(city);
    }

    @GetMapping("/delect")
    public void delect(int id){
        cityService.delect(id);
    }

    @GetMapping("/query")
    public City queryOne(int id){
        return cityService.queryOne(id);
    }

    @GetMapping("/update")
    public void update(City city){
        cityService.update(city);
    }

}
