package com.himoko.service.impl;

import com.himoko.dao.UserMapper;
import com.himoko.pojo.User;
import com.himoko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findUsers() {
        return userMapper.findUsers();
    }
}
