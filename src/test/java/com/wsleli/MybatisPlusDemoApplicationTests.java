package com.wsleli;

import com.wsleli.dao.UserDao;
import com.wsleli.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpDemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }
}
