package com.leosam.police.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PoliceCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PoliceCaseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportedTimeIsNull() {
            addCriterion("reported_time is null");
            return (Criteria) this;
        }

        public Criteria andReportedTimeIsNotNull() {
            addCriterion("reported_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("reported_time =", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("reported_time <>", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("reported_time >", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reported_time >=", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeLessThan(Date value) {
            addCriterionForJDBCDate("reported_time <", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reported_time <=", value, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("reported_time in", values, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("reported_time not in", values, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reported_time between", value1, value2, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andReportedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reported_time not between", value1, value2, "reportedTime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeIsNull() {
            addCriterion("crime_time is null");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeIsNotNull() {
            addCriterion("crime_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeEqualTo(String value) {
            addCriterion("crime_time =", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotEqualTo(String value) {
            addCriterion("crime_time <>", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeGreaterThan(String value) {
            addCriterion("crime_time >", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("crime_time >=", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeLessThan(String value) {
            addCriterion("crime_time <", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeLessThanOrEqualTo(String value) {
            addCriterion("crime_time <=", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeLike(String value) {
            addCriterion("crime_time like", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotLike(String value) {
            addCriterion("crime_time not like", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeIn(List<String> values) {
            addCriterion("crime_time in", values, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotIn(List<String> values) {
            addCriterion("crime_time not in", values, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeBetween(String value1, String value2) {
            addCriterion("crime_time between", value1, value2, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotBetween(String value1, String value2) {
            addCriterion("crime_time not between", value1, value2, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIsNull() {
            addCriterion("specific_time is null");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIsNotNull() {
            addCriterion("specific_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeEqualTo(String value) {
            addCriterion("specific_time =", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotEqualTo(String value) {
            addCriterion("specific_time <>", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeGreaterThan(String value) {
            addCriterion("specific_time >", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeGreaterThanOrEqualTo(String value) {
            addCriterion("specific_time >=", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeLessThan(String value) {
            addCriterion("specific_time <", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeLessThanOrEqualTo(String value) {
            addCriterion("specific_time <=", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeLike(String value) {
            addCriterion("specific_time like", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotLike(String value) {
            addCriterion("specific_time not like", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIn(List<String> values) {
            addCriterion("specific_time in", values, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotIn(List<String> values) {
            addCriterion("specific_time not in", values, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeBetween(String value1, String value2) {
            addCriterion("specific_time between", value1, value2, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotBetween(String value1, String value2) {
            addCriterion("specific_time not between", value1, value2, "specificTime");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodIsNull() {
            addCriterion("crime_method is null");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodIsNotNull() {
            addCriterion("crime_method is not null");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodEqualTo(String value) {
            addCriterion("crime_method =", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodNotEqualTo(String value) {
            addCriterion("crime_method <>", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodGreaterThan(String value) {
            addCriterion("crime_method >", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodGreaterThanOrEqualTo(String value) {
            addCriterion("crime_method >=", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodLessThan(String value) {
            addCriterion("crime_method <", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodLessThanOrEqualTo(String value) {
            addCriterion("crime_method <=", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodLike(String value) {
            addCriterion("crime_method like", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodNotLike(String value) {
            addCriterion("crime_method not like", value, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodIn(List<String> values) {
            addCriterion("crime_method in", values, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodNotIn(List<String> values) {
            addCriterion("crime_method not in", values, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodBetween(String value1, String value2) {
            addCriterion("crime_method between", value1, value2, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andCrimeMethodNotBetween(String value1, String value2) {
            addCriterion("crime_method not between", value1, value2, "crimeMethod");
            return (Criteria) this;
        }

        public Criteria andMainourIsNull() {
            addCriterion("mainour is null");
            return (Criteria) this;
        }

        public Criteria andMainourIsNotNull() {
            addCriterion("mainour is not null");
            return (Criteria) this;
        }

        public Criteria andMainourEqualTo(String value) {
            addCriterion("mainour =", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourNotEqualTo(String value) {
            addCriterion("mainour <>", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourGreaterThan(String value) {
            addCriterion("mainour >", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourGreaterThanOrEqualTo(String value) {
            addCriterion("mainour >=", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourLessThan(String value) {
            addCriterion("mainour <", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourLessThanOrEqualTo(String value) {
            addCriterion("mainour <=", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourLike(String value) {
            addCriterion("mainour like", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourNotLike(String value) {
            addCriterion("mainour not like", value, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourIn(List<String> values) {
            addCriterion("mainour in", values, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourNotIn(List<String> values) {
            addCriterion("mainour not in", values, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourBetween(String value1, String value2) {
            addCriterion("mainour between", value1, value2, "mainour");
            return (Criteria) this;
        }

        public Criteria andMainourNotBetween(String value1, String value2) {
            addCriterion("mainour not between", value1, value2, "mainour");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNull() {
            addCriterion("monitor is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNotNull() {
            addCriterion("monitor is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorEqualTo(Integer value) {
            addCriterion("monitor =", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotEqualTo(Integer value) {
            addCriterion("monitor <>", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThan(Integer value) {
            addCriterion("monitor >", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor >=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThan(Integer value) {
            addCriterion("monitor <", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThanOrEqualTo(Integer value) {
            addCriterion("monitor <=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorIn(List<Integer> values) {
            addCriterion("monitor in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotIn(List<Integer> values) {
            addCriterion("monitor not in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorBetween(Integer value1, Integer value2) {
            addCriterion("monitor between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor not between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andIdentityClueIsNull() {
            addCriterion("identity_clue is null");
            return (Criteria) this;
        }

        public Criteria andIdentityClueIsNotNull() {
            addCriterion("identity_clue is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityClueEqualTo(Integer value) {
            addCriterion("identity_clue =", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueNotEqualTo(Integer value) {
            addCriterion("identity_clue <>", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueGreaterThan(Integer value) {
            addCriterion("identity_clue >", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity_clue >=", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueLessThan(Integer value) {
            addCriterion("identity_clue <", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueLessThanOrEqualTo(Integer value) {
            addCriterion("identity_clue <=", value, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueIn(List<Integer> values) {
            addCriterion("identity_clue in", values, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueNotIn(List<Integer> values) {
            addCriterion("identity_clue not in", values, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueBetween(Integer value1, Integer value2) {
            addCriterion("identity_clue between", value1, value2, "identityClue");
            return (Criteria) this;
        }

        public Criteria andIdentityClueNotBetween(Integer value1, Integer value2) {
            addCriterion("identity_clue not between", value1, value2, "identityClue");
            return (Criteria) this;
        }

        public Criteria andCaptureIsNull() {
            addCriterion("capture is null");
            return (Criteria) this;
        }

        public Criteria andCaptureIsNotNull() {
            addCriterion("capture is not null");
            return (Criteria) this;
        }

        public Criteria andCaptureEqualTo(String value) {
            addCriterion("capture =", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureNotEqualTo(String value) {
            addCriterion("capture <>", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureGreaterThan(String value) {
            addCriterion("capture >", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureGreaterThanOrEqualTo(String value) {
            addCriterion("capture >=", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureLessThan(String value) {
            addCriterion("capture <", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureLessThanOrEqualTo(String value) {
            addCriterion("capture <=", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureLike(String value) {
            addCriterion("capture like", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureNotLike(String value) {
            addCriterion("capture not like", value, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureIn(List<String> values) {
            addCriterion("capture in", values, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureNotIn(List<String> values) {
            addCriterion("capture not in", values, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureBetween(String value1, String value2) {
            addCriterion("capture between", value1, value2, "capture");
            return (Criteria) this;
        }

        public Criteria andCaptureNotBetween(String value1, String value2) {
            addCriterion("capture not between", value1, value2, "capture");
            return (Criteria) this;
        }

        public Criteria andCaseQualitIsNull() {
            addCriterion("case_qualit is null");
            return (Criteria) this;
        }

        public Criteria andCaseQualitIsNotNull() {
            addCriterion("case_qualit is not null");
            return (Criteria) this;
        }

        public Criteria andCaseQualitEqualTo(String value) {
            addCriterion("case_qualit =", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitNotEqualTo(String value) {
            addCriterion("case_qualit <>", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitGreaterThan(String value) {
            addCriterion("case_qualit >", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitGreaterThanOrEqualTo(String value) {
            addCriterion("case_qualit >=", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitLessThan(String value) {
            addCriterion("case_qualit <", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitLessThanOrEqualTo(String value) {
            addCriterion("case_qualit <=", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitLike(String value) {
            addCriterion("case_qualit like", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitNotLike(String value) {
            addCriterion("case_qualit not like", value, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitIn(List<String> values) {
            addCriterion("case_qualit in", values, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitNotIn(List<String> values) {
            addCriterion("case_qualit not in", values, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitBetween(String value1, String value2) {
            addCriterion("case_qualit between", value1, value2, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseQualitNotBetween(String value1, String value2) {
            addCriterion("case_qualit not between", value1, value2, "caseQualit");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIsNull() {
            addCriterion("case_area is null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIsNotNull() {
            addCriterion("case_area is not null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaEqualTo(String value) {
            addCriterion("case_area =", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotEqualTo(String value) {
            addCriterion("case_area <>", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaGreaterThan(String value) {
            addCriterion("case_area >", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("case_area >=", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLessThan(String value) {
            addCriterion("case_area <", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLessThanOrEqualTo(String value) {
            addCriterion("case_area <=", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLike(String value) {
            addCriterion("case_area like", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotLike(String value) {
            addCriterion("case_area not like", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIn(List<String> values) {
            addCriterion("case_area in", values, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotIn(List<String> values) {
            addCriterion("case_area not in", values, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaBetween(String value1, String value2) {
            addCriterion("case_area between", value1, value2, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotBetween(String value1, String value2) {
            addCriterion("case_area not between", value1, value2, "caseArea");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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