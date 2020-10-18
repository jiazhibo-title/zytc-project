package com.zytc.demo.mapper;

import com.zytc.demo.entity.Area;
import com.zytc.demo.entity.City;
import com.zytc.demo.entity.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

    List<Province> queryProvince();

    List<City> queryCity(String provinceId);

    List<Area> queryArea(String cityId);
}
