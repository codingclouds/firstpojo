package com.leosam.police.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuspectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SuspectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(String value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(String value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(String value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(String value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(String value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLike(String value) {
            addCriterion("case_id like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotLike(String value) {
            addCriterion("case_id not like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<String> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<String> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(String value1, String value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(String value1, String value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneMacIsNull() {
            addCriterion("phone_mac is null");
            return (Criteria) this;
        }

        public Criteria andPhoneMacIsNotNull() {
            addCriterion("phone_mac is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneMacEqualTo(String value) {
            addCriterion("phone_mac =", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacNotEqualTo(String value) {
            addCriterion("phone_mac <>", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacGreaterThan(String value) {
            addCriterion("phone_mac >", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacGreaterThanOrEqualTo(String value) {
            addCriterion("phone_mac >=", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacLessThan(String value) {
            addCriterion("phone_mac <", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacLessThanOrEqualTo(String value) {
            addCriterion("phone_mac <=", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacLike(String value) {
            addCriterion("phone_mac like", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacNotLike(String value) {
            addCriterion("phone_mac not like", value, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacIn(List<String> values) {
            addCriterion("phone_mac in", values, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacNotIn(List<String> values) {
            addCriterion("phone_mac not in", values, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacBetween(String value1, String value2) {
            addCriterion("phone_mac between", value1, value2, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneMacNotBetween(String value1, String value2) {
            addCriterion("phone_mac not between", value1, value2, "phoneMac");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiIsNull() {
            addCriterion("phone_imei is null");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiIsNotNull() {
            addCriterion("phone_imei is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiEqualTo(String value) {
            addCriterion("phone_imei =", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiNotEqualTo(String value) {
            addCriterion("phone_imei <>", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiGreaterThan(String value) {
            addCriterion("phone_imei >", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiGreaterThanOrEqualTo(String value) {
            addCriterion("phone_imei >=", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiLessThan(String value) {
            addCriterion("phone_imei <", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiLessThanOrEqualTo(String value) {
            addCriterion("phone_imei <=", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiLike(String value) {
            addCriterion("phone_imei like", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiNotLike(String value) {
            addCriterion("phone_imei not like", value, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiIn(List<String> values) {
            addCriterion("phone_imei in", values, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiNotIn(List<String> values) {
            addCriterion("phone_imei not in", values, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiBetween(String value1, String value2) {
            addCriterion("phone_imei between", value1, value2, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andPhoneImeiNotBetween(String value1, String value2) {
            addCriterion("phone_imei not between", value1, value2, "phoneImei");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andLatestTrackIsNull() {
            addCriterion("latest_track is null");
            return (Criteria) this;
        }

        public Criteria andLatestTrackIsNotNull() {
            addCriterion("latest_track is not null");
            return (Criteria) this;
        }

        public Criteria andLatestTrackEqualTo(String value) {
            addCriterion("latest_track =", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackNotEqualTo(String value) {
            addCriterion("latest_track <>", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackGreaterThan(String value) {
            addCriterion("latest_track >", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackGreaterThanOrEqualTo(String value) {
            addCriterion("latest_track >=", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackLessThan(String value) {
            addCriterion("latest_track <", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackLessThanOrEqualTo(String value) {
            addCriterion("latest_track <=", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackLike(String value) {
            addCriterion("latest_track like", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackNotLike(String value) {
            addCriterion("latest_track not like", value, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackIn(List<String> values) {
            addCriterion("latest_track in", values, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackNotIn(List<String> values) {
            addCriterion("latest_track not in", values, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackBetween(String value1, String value2) {
            addCriterion("latest_track between", value1, value2, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andLatestTrackNotBetween(String value1, String value2) {
            addCriterion("latest_track not between", value1, value2, "latestTrack");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIsNull() {
            addCriterion("monitor_status is null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIsNotNull() {
            addCriterion("monitor_status is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusEqualTo(Integer value) {
            addCriterion("monitor_status =", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotEqualTo(Integer value) {
            addCriterion("monitor_status <>", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThan(Integer value) {
            addCriterion("monitor_status >", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_status >=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThan(Integer value) {
            addCriterion("monitor_status <", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_status <=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIn(List<Integer> values) {
            addCriterion("monitor_status in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotIn(List<Integer> values) {
            addCriterion("monitor_status not in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusBetween(Integer value1, Integer value2) {
            addCriterion("monitor_status between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_status not between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedIsNull() {
            addCriterion("related is null");
            return (Criteria) this;
        }

        public Criteria andRelatedIsNotNull() {
            addCriterion("related is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedEqualTo(String value) {
            addCriterion("related =", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotEqualTo(String value) {
            addCriterion("related <>", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThan(String value) {
            addCriterion("related >", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThanOrEqualTo(String value) {
            addCriterion("related >=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThan(String value) {
            addCriterion("related <", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThanOrEqualTo(String value) {
            addCriterion("related <=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLike(String value) {
            addCriterion("related like", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotLike(String value) {
            addCriterion("related not like", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedIn(List<String> values) {
            addCriterion("related in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotIn(List<String> values) {
            addCriterion("related not in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedBetween(String value1, String value2) {
            addCriterion("related between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotBetween(String value1, String value2) {
            addCriterion("related not between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}