package com.wang.mybatis_plus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.mybatis_plus.entity.User;
import com.wang.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // 参数是一个wrapper,条件构造器，
        List<User> users = userMapper.selectList(null);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void test01() {
         User user = new User();
         user.setAge(3);
         user.setName("王一一");
         user.setEmail("989886@163.com");
         int insert = userMapper.insert(user);
         if(insert == 1) {
             System.out.println("插入成功");
         }else {
             System.out.println("插入失败");
         }
    }

    @Test
    public void test02() {
        User user = new User();
        // 通过条件自动拼接动态sql
        user.setId(6l);
        user.setName("jack1");
        int i = userMapper.updateById(user);
        if(i == 1) {
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }


    @Test
    public void test03() { // 测试乐观锁成功
        // 1.查询用户信息
        User user = userMapper.selectById(1l);
        // 2.修改用户信息
        user.setEmail("123456@qq.com");
        // 3.执行更新操作
        int i = userMapper.updateById(user);
        if(i == 1) {
            System.out.println("乐观锁更新成功");
        }else {
            System.out.println("乐观锁更新失败");
        }
    }

    @Test
    public void test04() { // 测试乐观锁失败

        // 线程1
        User user1 = userMapper.selectById("1l");
        user1.setName("abc");

        // 模拟另外一个线程执行了插队操作
        User user2 = userMapper.selectById("1l");
        user2.setName("qwe");
        userMapper.updateById(user2);

        userMapper.updateById(user1);

    }

    @Test
    public void test05() { // 单个查询
        User user = userMapper.selectById(1l);
        System.out.println(user);
    }

    @Test
    public void test06() { // 批量查询
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1,2,3));
        users.forEach(System.out::println);
    }

    @Test
    public void test07() { // 自定义查询
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","Jack");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    public void test08() {
        Page<User> userPage = new Page<>(1, 5);
        userMapper.selectPage(userPage, null);
        userPage.getRecords().forEach(System.out::println);
    }

    @Test
    public void test09() {
        try {
            int i = userMapper.deleteById(1315585701681950723l);
            if(i == 1) {
                System.out.println("删除成功");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
