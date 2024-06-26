package com.wsleli;

import com.wsleli.dao.UserDao;
import com.wsleli.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        user.setName("黑马程序员");
        user.setPwd("wsleli");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1805952736113618945L);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(3L);
        user.setName("Jock666");
        user.setOnline(1);
        userDao.updateById(user);
    }
}
