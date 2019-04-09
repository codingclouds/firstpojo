package com.leosam.police.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title phone
 * @Author leosam
 * @version 1.0
 * @Date 2019-03-07 23:33:15
 */
public class Phone implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 案件编号：字符串，外键对应案件中的案件编号
     */
    private String caseId;

    /**
     * 手机号；字符串；限定输入位数
     */
    private String phoneNum;

    /**
     * 手机MAC:字符串；固定格式（例子：38:37:8B:22:74:76）
     */
    private String phoneMac;

    /**
     * 布控情况：逻辑型；是否 0否 1是
     */
    private Integer monitorStatus;

    /**
     * 手机MAC预警情况：字符串；手工输入
     */
    private String macStatus;

    /**
     * 追回情况：逻辑性；是否 0否 1是
     */
    private Integer recoverStatus;

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

    public Phone setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCaseId() {
        return caseId;
    }

    public Phone setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
        return this;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Phone setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
        return this;
    }

    public String getPhoneMac() {
        return phoneMac;
    }

    public Phone setPhoneMac(String phoneMac) {
        this.phoneMac = phoneMac == null ? null : phoneMac.trim();
        return this;
    }

    public Integer getMonitorStatus() {
        return monitorStatus;
    }

    public Phone setMonitorStatus(Integer monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }

    public String getMacStatus() {
        return macStatus;
    }

    public Phone setMacStatus(String macStatus) {
        this.macStatus = macStatus == null ? null : macStatus.trim();
        return this;
    }

    public Integer getRecoverStatus() {
        return recoverStatus;
    }

    public Phone setRecoverStatus(Integer recoverStatus) {
        this.recoverStatus = recoverStatus;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Phone setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Phone setCreateTime(Date createTime) {
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
        Phone other = (Phone) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getPhoneMac() == null ? other.getPhoneMac() == null : this.getPhoneMac().equals(other.getPhoneMac()))
            && (this.getMonitorStatus() == null ? other.getMonitorStatus() == null : this.getMonitorStatus().equals(other.getMonitorStatus()))
            && (this.getMacStatus() == null ? other.getMacStatus() == null : this.getMacStatus().equals(other.getMacStatus()))
            && (this.getRecoverStatus() == null ? other.getRecoverStatus() == null : this.getRecoverStatus().equals(other.getRecoverStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getPhoneMac() == null) ? 0 : getPhoneMac().hashCode());
        result = prime * result + ((getMonitorStatus() == null) ? 0 : getMonitorStatus().hashCode());
        result = prime * result + ((getMacStatus() == null) ? 0 : getMacStatus().hashCode());
        result = prime * result + ((getRecoverStatus() == null) ? 0 : getRecoverStatus().hashCode());
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
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", phoneMac=").append(phoneMac);
        sb.append(", monitorStatus=").append(monitorStatus);
        sb.append(", macStatus=").append(macStatus);
        sb.append(", recoverStatus=").append(recoverStatus);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}