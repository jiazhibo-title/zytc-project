package com.zytc.demo.controller;

import com.zytc.demo.entity.Area;
import com.zytc.demo.entity.City;
import com.zytc.demo.entity.Province;
import com.zytc.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin(allowCredentials = "true",maxAge = 3600)
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/getProvince")
    public List<Province> getProvince(){
        List<Province> provinces = cityService.queryProvince();
        return provinces;
    }

    @RequestMapping("/getCity/{provinceId}")
    public List<City> getCity(@PathVariable("provinceId") String provinceId){
        return cityService.queryCity(provinceId);
    }

    @RequestMapping("/getArea/{cityId}")
    public List<Area> getArea(@PathVariable("cityId") String cityId){
        return cityService.queryArea(cityId);
    }

}
