package com.wsleli;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsleli.dao.UserDao;
import com.wsleli.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // 方式一:按条件查询
        // QueryWrapper qw = new QueryWrapper();
        // qw.lt("age", 18);
        // List<User> userList = userDao.selectList(qw);
        // System.out.println(userList);

        // 方式二:Lambda格式按条件查询
        // QueryWrapper<User> qw = new QueryWrapper<User>();
        // qw.lambda().lt(User::getAge, 10);
        // List<User> userList = userDao.selectList(qw);
        // System.out.println(userList);

        // 方式三:lambda格式按条件查询
        // LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        // lqw.lt(User::getAge, 10);
        // List<User> userList = userDao.selectList(lqw);
        // System.out.println(userList);

//-----------------------------------------------------------------------------------

        // LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();

        // 1. and，默认不用加
        // lqw.lt(User::getAge, 30);
        // lqw.gt(User::getAge, 10);

        // lqw.lt(User::getAge, 30).gt(User::getAge, 10);


        // 2. or
        // lqw.lt(User::getAge, 10);
        // lqw.gt(User::getAge, 30);
        // lqw.or();// 变量范围内任意位置

        // lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);

        // 3. 模拟查空值
        // UserQuery uq = new UserQuery();
        // // uq.setAge(10);
        // uq.setAge2(30);
        // lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2())
        //         .gt(null != uq.getAge(), User::getAge, uq.getAge());

        // List<User> userList = userDao.selectList(lqw);
        // System.out.println(userList);

//-----------------------------------------------------------------------------------

        // 查询投影
        // lambda格式
        // LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        // lqw.select(User::getId,User::getName,User::getAge);

        // 非lambda格式
        QueryWrapper<User> lqw = new QueryWrapper<User>();
        // lqw.select("id", "name", "age", "tel");
        // List<User> userList = userDao.selectList(lqw);
        // System.out.println(userList);

        // 聚合查询，分组查询
        lqw.select("count(*) as count,tel");
        lqw.groupBy("tel");
        // SELECT count(*) as count FROM user

        // lqw.select("max(age) as maxAge");
        // SELECT max(age) as maxAge FROM user

        // lqw.select("min(age) as minAge");
        // SELECT min(age) as minAge FROM user

        // lqw.select("sum(age) as sumAge");
        // SELECT sum(age) as sumAge FROM user

        // lqw.select("avg(age) as avgAge");
        // SELECT avg(age) as avgAge FROM user
        List<Map<String, Object>> userList = userDao.selectMaps(lqw);
        System.out.println(userList);
    }
}
