package com.zytc.demo.controller;

import com.zytc.demo.entity.Test;
import com.zytc.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/test")
@CrossOrigin(allowCredentials = "true",maxAge = 3600)
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public void  Test(@RequestParam Test test){
        testService.addMan(test);
    }
    @RequestMapping("/selectCase")
    public Map selectAll() {
        Map map = new HashMap();
        List allCase = testService.selctAll();
        map.put("code",0);
        map.put("msg","");
        map.put("count",1000);
        map.put("data",allCase);
        return map;
    }

}
