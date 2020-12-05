package com.kangaroo.firstspringboot.mapper;

import com.kangaroo.firstspringboot.FirstSpringbootApplicationTests;
import com.kangaroo.firstspringboot.entity.District;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistrictMapperTest extends FirstSpringbootApplicationTests {

    @Autowired
    private DistrictMapper mapper;

    @Test
    void findAll() {
        List<District> all = mapper.findAll();
        all.forEach(item -> System.out.println(item));
    }

    @Test
    void findOneById() {
        District district = mapper.findOneById(5);
        System.out.println(district);
    }
}