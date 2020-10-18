package com.zytc.demo.service.impl;

import com.zytc.demo.entity.Area;
import com.zytc.demo.entity.City;
import com.zytc.demo.entity.Province;
import com.zytc.demo.mapper.CityMapper;
import com.zytc.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<Province> queryProvince() {
        return cityMapper.queryProvince();
    }

    @Override
    public List<City> queryCity(String provinceId) {
        return cityMapper.queryCity(provinceId);
    }

    @Override
    public List<Area> queryArea(String cityId) {
        return cityMapper.queryArea(cityId);
    }
}
