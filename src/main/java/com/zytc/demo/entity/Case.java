package com.zytc.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Case {

    private Integer id;
    private String sourceCompany;
    private String consumerName;
    private Integer insuranceType;
    private String insuranceContent;
    private String province;
    private String city;
    private String area;
    private Date receiveTime;
    private Integer receiveCompany;
    private Date allotTime;
    private String allotEmployee;
    private Integer maxTime;
    private Integer caseStatus;
    private Integer caseType;
    private Date backTime;
    private Integer backCount;
    private String backData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourceCompany() {
        return sourceCompany;
    }

    public void setSourceCompany(String sourceCompany) {
        this.sourceCompany = sourceCompany;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public Integer getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(Integer insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceContent() {
        return insuranceContent;
    }

    public void setInsuranceContent(String insuranceContent) {
        this.insuranceContent = insuranceContent;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getReceiveTime() {
        return new SimpleDateFormat("yyyy-MM-dd").format(receiveTime);
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getReceiveCompany() {
        return receiveCompany;
    }

    public void setReceiveCompany(Integer receiveCompany) {
        this.receiveCompany = receiveCompany;
    }

    public Date getAllotTime() {
        return allotTime;
    }

    public void setAllotTime(Date allotTime) {
        this.allotTime = allotTime;
    }

    public String getAllotEmployee() {
        return allotEmployee;
    }

    public void setAllotEmployee(String allotEmployee) {
        this.allotEmployee = allotEmployee;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public Integer getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public Integer getBackCount() {
        return backCount;
    }

    public void setBackCount(Integer backCount) {
        this.backCount = backCount;
    }

    public String getBackData() {
        return backData;
    }

    public void setBackData(String backData) {
        this.backData = backData;
    }

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", sourceCompany='" + sourceCompany + '\'' +
                ", consumerName='" + consumerName + '\'' +
                ", insuranceType=" + insuranceType +
                ", insuranceContent=" + insuranceContent +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", receiveTime=" + receiveTime +
                ", receiveCompany=" + receiveCompany +
                ", allotTime=" + allotTime +
                ", allotEmployee='" + allotEmployee + '\'' +
                ", maxTime=" + maxTime +
                ", caseStatus=" + caseStatus +
                ", caseType=" + caseType +
                ", backTime=" + backTime +
                ", backCount=" + backCount +
                ", backData=" + backData +
                '}';
    }
}
