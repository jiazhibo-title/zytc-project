package com.zytc.demo.service;

import com.zytc.demo.entity.Area;
import com.zytc.demo.entity.City;
import com.zytc.demo.entity.Province;

import java.util.List;

public interface CityService {

   List<Province> queryProvince();

   List<City> queryCity(String provinceId);

    List<Area> queryArea(String cityId);

}
