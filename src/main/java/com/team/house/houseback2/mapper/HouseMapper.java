package com.team.house.houseback2.mapper;

import com.team.house.houseback2.entity.House;
import com.team.house.houseback2.entity.HouseExample;
import com.team.house.houseback2.util.HouseCondition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    public List<House> getHouseByUser(Integer id);
    //浏览出租房(搜索)
    List<House> getBroswerHouse(HouseCondition houseCondition);
}