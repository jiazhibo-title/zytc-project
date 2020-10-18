package com.zytc.demo.service;

import com.zytc.demo.entity.Case;

import java.util.List;
import java.util.Map;

public interface CaseService {

    void addCase(Map<String,String> oneCase);

    List<Case> selectCase(Map selectConditions);

    void updateCase(Map updateConditions);

    Integer sumCase();
}
