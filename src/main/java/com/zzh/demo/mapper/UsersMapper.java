package com.zzh.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzh.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends BaseMapper<User> {
}
