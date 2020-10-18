package com.zytc.demo.controller;

import com.zytc.demo.entity.Case;
import com.zytc.demo.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/case")
@CrossOrigin(allowCredentials = "true",maxAge = 3600)
public class CaseController {
    @Autowired
    private CaseService caseService;

    @RequestMapping("/addCase")
    public void addCase(@RequestParam Map oneCase){
        caseService.addCase(oneCase);
    }

    @RequestMapping("/selcetCase")
    public Map selcetCase(@PathVariable Map selectConditions){
        Map map = new HashMap();
        List<Case> cases = caseService.selectCase(selectConditions);
        map.put("code",0);
        map.put("msg","");
        map.put("count",caseService.sumCase());
        map.put("data",cases);
        return map;
    }

    @RequestMapping("/updateCase")
    public void updateCase(@PathVariable Map updateConditions){
        caseService.updateCase(updateConditions);
    }

}
