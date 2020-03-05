package com.team.house.houseback2.service.impl;

import com.team.house.houseback2.entity.District;
import com.team.house.houseback2.entity.DistrictExample;
import com.team.house.houseback2.mapper.DistrictMapper;
import com.team.house.houseback2.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
