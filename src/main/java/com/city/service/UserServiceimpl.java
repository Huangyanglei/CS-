package com.city.service;

import com.city.dao.Usermapper;
import com.city.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    Usermapper Userdao;


    @Override
    public int sava(User user) {
        return Userdao.sava(user);
    }

    @Override
    public void update(User user) {
        Userdao.update(user);
    }
}
