package com.leosam.police.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title police_case
 * @Author leosam
 * @version 1.0
 * @Date 2019-03-07 23:33:15
 */
public class PoliceCase implements Serializable {
    /**
     * 案件编号： 主键；字符串；手工输入
     */
    private String id;

    /**
     * 报案时间：日期时间型，格式“yyyy-mm-dd”
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reportedTime;

    /**
     * 案发地点：字符串；手工输入；
     */
    private String location;

    /**
     * 案发时段：字符串；下拉列表选择值（上午、下午、上半夜、下半夜、不明）
     */
    private String crimeTime;

    /**
     * 具体时间：字符串；手工输入
     */
    private String specificTime;

    /**
     * 作案手段：字符串；下拉列表选择值（扒窃、盗窃超市、盗窃车内财物、盗窃电瓶、盗窃店铺、盗窃非机动车、盗窃手机、路面诈骗、入室盗窃、其他盗窃）
     */
    private String crimeMethod;

    /**
     * 被窃物品：字符串；手工输入
     */
    private String mainour;

    /**
     * 监控线索：逻辑型；是否  0否 1是
     */
    private Integer monitor;

    /**
     * 身份线索：逻辑型；是否  0否 1是
     */
    private Integer identityClue;

    /**
     * 抓获情况：字符串；下拉列表选择值（抓获、未抓获）
     */
    private String capture;

    /**
     * 案件性质：字符串；下拉列表选择值（刑事、治安）
     */
    private String caseQualit;

    /**
     * 案件区域：字符串；下拉列表选择值（环内、环外）
     */
    private String caseArea;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 录入时间：日期时间型；默认获取当前时间（yyyy-mm-dd hh:mm:ss）
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public PoliceCase setId(String id) {
        this.id = id == null ? null : id.trim();
        return this;
    }

    public Date getReportedTime() {
        return reportedTime;
    }

    public PoliceCase setReportedTime(Date reportedTime) {
        this.reportedTime = reportedTime;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public PoliceCase setLocation(String location) {
        this.location = location == null ? null : location.trim();
        return this;
    }

    public String getCrimeTime() {
        return crimeTime;
    }

    public PoliceCase setCrimeTime(String crimeTime) {
        this.crimeTime = crimeTime == null ? null : crimeTime.trim();
        return this;
    }

    public String getSpecificTime() {
        return specificTime;
    }

    public PoliceCase setSpecificTime(String specificTime) {
        this.specificTime = specificTime == null ? null : specificTime.trim();
        return this;
    }

    public String getCrimeMethod() {
        return crimeMethod;
    }

    public PoliceCase setCrimeMethod(String crimeMethod) {
        this.crimeMethod = crimeMethod == null ? null : crimeMethod.trim();
        return this;
    }

    public String getMainour() {
        return mainour;
    }

    public PoliceCase setMainour(String mainour) {
        this.mainour = mainour == null ? null : mainour.trim();
        return this;
    }

    public Integer getMonitor() {
        return monitor;
    }

    public PoliceCase setMonitor(Integer monitor) {
        this.monitor = monitor;
        return this;
    }

    public Integer getIdentityClue() {
        return identityClue;
    }

    public PoliceCase setIdentityClue(Integer identityClue) {
        this.identityClue = identityClue;
        return this;
    }

    public String getCapture() {
        return capture;
    }

    public PoliceCase setCapture(String capture) {
        this.capture = capture == null ? null : capture.trim();
        return this;
    }

    public String getCaseQualit() {
        return caseQualit;
    }

    public PoliceCase setCaseQualit(String caseQualit) {
        this.caseQualit = caseQualit == null ? null : caseQualit.trim();
        return this;
    }

    public String getCaseArea() {
        return caseArea;
    }

    public PoliceCase setCaseArea(String caseArea) {
        this.caseArea = caseArea == null ? null : caseArea.trim();
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public PoliceCase setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public PoliceCase setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PoliceCase setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PoliceCase other = (PoliceCase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportedTime() == null ? other.getReportedTime() == null : this.getReportedTime().equals(other.getReportedTime()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getCrimeTime() == null ? other.getCrimeTime() == null : this.getCrimeTime().equals(other.getCrimeTime()))
            && (this.getSpecificTime() == null ? other.getSpecificTime() == null : this.getSpecificTime().equals(other.getSpecificTime()))
            && (this.getCrimeMethod() == null ? other.getCrimeMethod() == null : this.getCrimeMethod().equals(other.getCrimeMethod()))
            && (this.getMainour() == null ? other.getMainour() == null : this.getMainour().equals(other.getMainour()))
            && (this.getMonitor() == null ? other.getMonitor() == null : this.getMonitor().equals(other.getMonitor()))
            && (this.getIdentityClue() == null ? other.getIdentityClue() == null : this.getIdentityClue().equals(other.getIdentityClue()))
            && (this.getCapture() == null ? other.getCapture() == null : this.getCapture().equals(other.getCapture()))
            && (this.getCaseQualit() == null ? other.getCaseQualit() == null : this.getCaseQualit().equals(other.getCaseQualit()))
            && (this.getCaseArea() == null ? other.getCaseArea() == null : this.getCaseArea().equals(other.getCaseArea()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportedTime() == null) ? 0 : getReportedTime().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getCrimeTime() == null) ? 0 : getCrimeTime().hashCode());
        result = prime * result + ((getSpecificTime() == null) ? 0 : getSpecificTime().hashCode());
        result = prime * result + ((getCrimeMethod() == null) ? 0 : getCrimeMethod().hashCode());
        result = prime * result + ((getMainour() == null) ? 0 : getMainour().hashCode());
        result = prime * result + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        result = prime * result + ((getIdentityClue() == null) ? 0 : getIdentityClue().hashCode());
        result = prime * result + ((getCapture() == null) ? 0 : getCapture().hashCode());
        result = prime * result + ((getCaseQualit() == null) ? 0 : getCaseQualit().hashCode());
        result = prime * result + ((getCaseArea() == null) ? 0 : getCaseArea().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportedTime=").append(reportedTime);
        sb.append(", location=").append(location);
        sb.append(", crimeTime=").append(crimeTime);
        sb.append(", specificTime=").append(specificTime);
        sb.append(", crimeMethod=").append(crimeMethod);
        sb.append(", mainour=").append(mainour);
        sb.append(", monitor=").append(monitor);
        sb.append(", identityClue=").append(identityClue);
        sb.append(", capture=").append(capture);
        sb.append(", caseQualit=").append(caseQualit);
        sb.append(", caseArea=").append(caseArea);
        sb.append(", remark=").append(remark);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}