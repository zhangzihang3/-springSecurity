package com.zzh.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzh.demo.entity.User;
import com.zzh.demo.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SringSecurityStudyApplicationTests {
    @Autowired
    UsersMapper usersMapper;
    @Test
    void contextLoads() {
        QueryWrapper<User> usersQueryWrapper = new QueryWrapper<>();
        QueryWrapper<User> args = usersQueryWrapper.eq("username", "1");
        User user = usersMapper.selectOne(args);
        System.out.println(user);
    }
}
