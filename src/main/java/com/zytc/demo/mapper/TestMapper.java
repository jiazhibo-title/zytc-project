package com.zytc.demo.mapper;

import com.zytc.demo.entity.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    void addMan(Test man);

    List<Test> selectAll();

    Integer selectCount();
}
