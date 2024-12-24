package com.soupbun.soupbunapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soupbun.soupbunapi.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
