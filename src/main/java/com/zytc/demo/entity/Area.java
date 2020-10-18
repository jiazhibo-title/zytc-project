package com.zytc.demo.entity;

public class Area {

    private Integer id;
    private String cityId;
    private String area;
    private String areaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", area='" + area + '\'' +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}
