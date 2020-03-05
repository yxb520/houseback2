package com.team.house.houseback2;

import com.team.house.houseback2.entity.DistrictExample;
import com.team.house.houseback2.entity.UsersExample;
import com.team.house.houseback2.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Houseback2ApplicationTests {
@Autowired(required = false)
private UsersMapper usersMapper;
    @Test
    public void contextLoads() {
       int tempt= usersMapper.selectByExample(new UsersExample()).size();
        System.out.println("总数"+tempt);
    }

}
