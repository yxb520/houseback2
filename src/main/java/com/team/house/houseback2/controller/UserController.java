package com.team.house.houseback2.controller;

import com.team.house.houseback2.entity.Users;
import com.team.house.houseback2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController   //全返回数据
public class UserController {
    @Autowired
    private UserService userService;
    //编写注册控制器
    @RequestMapping("/userReg")
    @CrossOrigin (value = "*",allowCredentials ="true")  //支持跨域
    public String userReg(Users users){
        //调用业务
        int temp=userService.regUser(users);  //成功1  失败0
        return "{\"result\":"+temp+"}";
    }

    //编写登入控制器
    @RequestMapping("/userLogin")
    @CrossOrigin (value = "*",allowCredentials ="true")  //支持跨域
    public String userLogin(String username, String password, HttpSession session){
        //调用业务
       Users user=userService.Login(username,password);  //成功1  失败0
       if(user==null){
           return "{\"result\":0}";  //登入失败
       }
       else{
            //只要登入请使用session保存登入人的信息
            session.setAttribute("logininfo",user);
            session.setMaxInactiveInterval(6000); //10分钟
            return "{\"result\":1}";  //登入成功
       }
    }

}
