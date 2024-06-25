package com.wsleli.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsleli.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/25 22:42
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}