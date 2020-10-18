package com.zytc.demo.service.impl;

import com.zytc.demo.entity.Test;
import com.zytc.demo.mapper.TestMapper;
import com.zytc.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper manMapper;

    @Override
    public void addMan(Test man) {
        man.setAge(1);
        man.setName("张三");
        man.setSex(1);
        man.setSheng("110000");
        man.setCity("110200");
        man.setCounty("110101");
        manMapper.addMan(man);
    }

    @Override
    public List<Test> selctAll() {

        return manMapper.selectAll();
    }

    @Override
    public Integer selectCount() {
        return manMapper.selectCount();
    }
}
