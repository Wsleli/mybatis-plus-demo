package com.wsleli.service.impl;

import com.wsleli.domain.User;
import com.wsleli.dao.UserDao;
import com.wsleli.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsleli
 * @since 2024-06-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
