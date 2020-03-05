package com.team.house.houseback2.service;

import com.team.house.houseback2.entity.Users;



public interface UserService {
    //注册业务
    public int regUser(Users users);
    //登入
    public Users Login(String username, String password);
}
