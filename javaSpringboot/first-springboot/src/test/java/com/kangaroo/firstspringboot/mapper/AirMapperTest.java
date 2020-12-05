package com.kangaroo.firstspringboot.mapper;

import com.kangaroo.firstspringboot.FirstSpringbootApplicationTests;
import com.kangaroo.firstspringboot.entity.Air;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


class AirMapperTest extends FirstSpringbootApplicationTests {

    @Autowired
    private AirMapper airMapper;

    @Test
    void findAll() {
        List<Air> list = airMapper.findAll();
        list.forEach(item -> System.out.println(item));
    }
}