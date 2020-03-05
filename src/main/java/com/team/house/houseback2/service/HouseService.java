package com.team.house.houseback2.service;

import com.github.pagehelper.PageInfo;
import com.team.house.houseback2.entity.House;
import com.team.house.houseback2.util.HouseCondition;
import com.team.house.houseback2.util.PageParameter;


public interface HouseService {
    /**
     * 发布出租房
     * @param house  实体
     * @return 影响行数
     */
    public int addHouse(House house);
    public PageInfo<House> getHouseByUser(Integer id,PageParameter pageParameter);
    public int delHouse(String id);
    /**
     * 搜索浏览出租房
     * @param houseCondition  搜索条件
     * @return 返回搜索的出租房
     */
    public PageInfo<House>  getBroswerHouse(HouseCondition houseCondition);

}
