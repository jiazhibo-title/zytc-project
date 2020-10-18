package com.zytc.demo.service;

import com.zytc.demo.entity.Test;

import java.util.List;

public interface TestService {

    void addMan(Test test);

    List<Test> selctAll();

    Integer selectCount();
}
