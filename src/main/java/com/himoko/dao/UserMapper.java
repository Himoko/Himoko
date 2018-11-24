package com.himoko.dao;

import com.himoko.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> findUsers();
}
