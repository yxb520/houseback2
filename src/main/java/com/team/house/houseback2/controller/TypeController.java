package com.team.house.houseback2.controller;

import com.team.house.houseback2.entity.Type;
import com.team.house.houseback2.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials ="true")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @RequestMapping("/getTypes")
    public List<Type> getTypes(){
        return typeService.getAllType();
    }
}
