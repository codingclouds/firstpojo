package com.leosam.police.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title suspect
 * @Author leosam
 * @version 1.0
 * @Date 2019-03-07 23:33:15
 */
public class Suspect implements Serializable {
    /**
     * int;主键；自动编号
     */
    private Integer id;

    /**
     * 案件编号：字符串；外键对应案件中的案件编号
     */
    private String caseId;

    /**
     * 姓名：字符串
     */
    private String name;

    /**
     * 身份证号码：字符串，限定输入位数
     */
    private String idCard;

    /**
     * 手机号；字符串；限定输入位数
     */
    private String phoneNum;

    /**
     * 手机MAC:字符串；固定格式（例子：38:37:8B:22:74:76）
     */
    private String phoneMac;

    /**
     * 手机IMEI:字符串；固定位数
     */
    private String phoneImei;

    /**
     * 微信号：字符串
     */
    private String weixin;

    /**
     * QQ号:字符串
     */
    private String qq;

    /**
     * 最新轨迹：字符串；手工输入
     */
    private String latestTrack;

    /**
     * 布控情况：逻辑型；是否 0否 1是
     */
    private Integer monitorStatus;

    /**
     * 关系人：字符串
     */
    private String related;

    /**
     * 车辆：字符串
     */
    private String car;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 录入时间：日期时间型；默认获取当前时间（yyyy-mm-dd hh:mm:ss）
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Suspect setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCaseId() {
        return caseId;
    }

    public Suspect setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public Suspect setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public Suspect setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
        return this;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Suspect setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
        return this;
    }

    public String getPhoneMac() {
        return phoneMac;
    }

    public Suspect setPhoneMac(String phoneMac) {
        this.phoneMac = phoneMac == null ? null : phoneMac.trim();
        return this;
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public Suspect setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei == null ? null : phoneImei.trim();
        return this;
    }

    public String getWeixin() {
        return weixin;
    }

    public Suspect setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
        return this;
    }

    public String getQq() {
        return qq;
    }

    public Suspect setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
        return this;
    }

    public String getLatestTrack() {
        return latestTrack;
    }

    public Suspect setLatestTrack(String latestTrack) {
        this.latestTrack = latestTrack == null ? null : latestTrack.trim();
        return this;
    }

    public Integer getMonitorStatus() {
        return monitorStatus;
    }

    public Suspect setMonitorStatus(Integer monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }

    public String getRelated() {
        return related;
    }

    public Suspect setRelated(String related) {
        this.related = related == null ? null : related.trim();
        return this;
    }

    public String getCar() {
        return car;
    }

    public Suspect setCar(String car) {
        this.car = car == null ? null : car.trim();
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Suspect setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Suspect setCreateTime(Date createTime) {
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
        Suspect other = (Suspect) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getPhoneMac() == null ? other.getPhoneMac() == null : this.getPhoneMac().equals(other.getPhoneMac()))
            && (this.getPhoneImei() == null ? other.getPhoneImei() == null : this.getPhoneImei().equals(other.getPhoneImei()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getLatestTrack() == null ? other.getLatestTrack() == null : this.getLatestTrack().equals(other.getLatestTrack()))
            && (this.getMonitorStatus() == null ? other.getMonitorStatus() == null : this.getMonitorStatus().equals(other.getMonitorStatus()))
            && (this.getRelated() == null ? other.getRelated() == null : this.getRelated().equals(other.getRelated()))
            && (this.getCar() == null ? other.getCar() == null : this.getCar().equals(other.getCar()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getPhoneMac() == null) ? 0 : getPhoneMac().hashCode());
        result = prime * result + ((getPhoneImei() == null) ? 0 : getPhoneImei().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getLatestTrack() == null) ? 0 : getLatestTrack().hashCode());
        result = prime * result + ((getMonitorStatus() == null) ? 0 : getMonitorStatus().hashCode());
        result = prime * result + ((getRelated() == null) ? 0 : getRelated().hashCode());
        result = prime * result + ((getCar() == null) ? 0 : getCar().hashCode());
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
        sb.append(", caseId=").append(caseId);
        sb.append(", name=").append(name);
        sb.append(", idCard=").append(idCard);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", phoneMac=").append(phoneMac);
        sb.append(", phoneImei=").append(phoneImei);
        sb.append(", weixin=").append(weixin);
        sb.append(", qq=").append(qq);
        sb.append(", latestTrack=").append(latestTrack);
        sb.append(", monitorStatus=").append(monitorStatus);
        sb.append(", related=").append(related);
        sb.append(", car=").append(car);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}