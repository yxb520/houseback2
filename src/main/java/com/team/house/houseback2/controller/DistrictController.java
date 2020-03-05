package com.team.house.houseback2.controller;

import com.team.house.houseback2.entity.District;
import com.team.house.houseback2.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*",allowCredentials ="true")
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @RequestMapping("/getDistrict")
    public List<District> getDistrict(){
        return districtService.getAllDistrict();
    }
}
