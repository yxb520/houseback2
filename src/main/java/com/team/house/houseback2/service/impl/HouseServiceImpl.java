package com.team.house.houseback2.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.houseback2.entity.House;
import com.team.house.houseback2.mapper.HouseMapper;
import com.team.house.houseback2.service.HouseService;

import com.team.house.houseback2.util.HouseCondition;
import com.team.house.houseback2.util.PageParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HouseServiceImpl implements HouseService {
    @Autowired(required =false)
    private HouseMapper houseMapper;
    @Override
    public int addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    @Override
    public PageInfo<House> getHouseByUser(Integer id, PageParameter pageParameter) {
        PageHelper.startPage(pageParameter.getPage(),pageParameter.getPageSize());
       List<House> list =houseMapper.getHouseByUser(id);
        return new PageInfo<>(list);
    }

    @Override
    public int delHouse(String id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<House> getBroswerHouse(HouseCondition houseCondition) {
        //开启分页
        PageHelper.startPage(houseCondition.getPage(),houseCondition.getPageSize());
        //调持久化操作查询所有
        List<House> list=houseMapper.getBroswerHouse(houseCondition);
        //获取分页信息
        return new PageInfo<>(list);
    }
    }


