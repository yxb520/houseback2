package com.team.house.houseback2.controller;

import com.team.house.houseback2.entity.Street;
import com.team.house.houseback2.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class StreetController {
    @Autowired
    private StreetService streetService;
    @RequestMapping("/getStreet")
    public List<Street> getStreet(Integer did ){
        return streetService.getAllStreet(did);
    }
}
