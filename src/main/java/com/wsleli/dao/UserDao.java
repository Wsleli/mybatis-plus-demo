package com.wsleli.dao;

import com.wsleli.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wsleli
 * @since 2024-06-27
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
