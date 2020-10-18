package com.zytc.demo.mapper;

import com.zytc.demo.entity.Case;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CaseMapper {

    void addCase(Case addCase);

    List<Case> selectAll();

    Integer sumData();
}
