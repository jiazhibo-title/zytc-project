package com.zytc.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.zytc.demo.entity.Case;
import com.zytc.demo.mapper.CaseMapper;
import com.zytc.demo.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseMapper caseMapper;

    @Override
    public void addCase(Map<String,String> oneCase) {
        Case newCase = new Case();
        newCase.setSourceCompany(oneCase.get("sourceCompany"));
        newCase.setConsumerName(oneCase.get("consumerName"));
        newCase.setInsuranceType(Integer.parseInt(oneCase.get("insuranceType")));
        newCase.setProvince(oneCase.get("province"));
        newCase.setCity(oneCase.get("city"));
        newCase.setArea(oneCase.get("area"));
        newCase.setCaseType(Integer.parseInt(oneCase.get("caseType")));
        newCase.setInsuranceContent(oneCase.get("insuranceContent"));
        Date nowTime = new Date();
        newCase.setReceiveTime(nowTime);
        caseMapper.addCase(newCase);
    }

    @Override
    public List<Case> selectCase(Map selectConditions) {
        List cases = caseMapper.selectAll();
        return cases;
    }

    @Override
    public void updateCase(Map updateConditions) {

    }

    @Override
    public Integer sumCase() {
        return caseMapper.sumData();
    }
}
