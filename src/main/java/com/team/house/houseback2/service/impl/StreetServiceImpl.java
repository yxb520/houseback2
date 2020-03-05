package com.team.house.houseback2.service.impl;

import com.team.house.houseback2.entity.Street;
import com.team.house.houseback2.entity.StreetExample;
import com.team.house.houseback2.mapper.StreetMapper;
import com.team.house.houseback2.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired(required = false)
    private StreetMapper streetMapper;
    @Override
    public List<Street> getAllStreet(Integer did) {
        StreetExample streetExample=new StreetExample();
       StreetExample.Criteria criteria=streetExample.createCriteria();
       criteria.andDistrictIdEqualTo(did);
       return streetMapper.selectByExample(streetExample);
    }
}
