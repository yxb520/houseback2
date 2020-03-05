package com.team.house.houseback2.service.impl;

import com.team.house.houseback2.entity.Users;
import com.team.house.houseback2.entity.UsersExample;
import com.team.house.houseback2.mapper.UsersMapper;
import com.team.house.houseback2.service.UserService;
import com.team.house.houseback2.util.MD5Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UsersMapper usersMapper;
    @Override
    public int regUser(Users users) {
        //密码不要以明文方式保存到数据中，这样做不安全
        //使用md5工具类对密码进行加密后存储到数据库
        //使用步骤:1.导入md5工具类  2.调用md5工具类的方法进行加密
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        return usersMapper.insertSelective(users);
    }

    @Override
    public Users Login(String username, String password) {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        //设置条件
        criteria.andNameEqualTo(username);
        //加密后与加密码的内容相比
        criteria.andPasswordEqualTo(MD5Utils.md5Encrypt(password));
        List<Users> list=usersMapper.selectByExample(usersExample);
        if(list!=null && list.size()==1){
            return list.get(0);  //返回第一个对象
        }
        else
        return null;
    }
}