package com.wang.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.mybatis_plus.entity.User;
import com.wang.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class WarpperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        // 查询name不为空的用户，并且邮箱不为空的用户，年龄大于等于12
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper
                .isNotNull("name")
                .isNotNull("email")
                .ge("age",12);
        userMapper.selectList(userQueryWrapper).forEach(System.out::println);
    }

    @Test
    public void test02() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "Tom");

        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    void test03() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age",10, 30);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }

    @Test
    void test04() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.notLike("name","e").likeRight("email","t");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    @Test
    void test05() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // id在子查询中查出来
        wrapper.inSql("id","select id from user where id < 3");

        List<Object> objects = userMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }

}