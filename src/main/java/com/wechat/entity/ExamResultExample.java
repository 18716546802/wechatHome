package com.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ExamResultExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
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

        public Criteria andEr_idIsNull() {
            addCriterion("er_id is null");
            return (Criteria) this;
        }

        public Criteria andEr_idIsNotNull() {
            addCriterion("er_id is not null");
            return (Criteria) this;
        }

        public Criteria andEr_idEqualTo(Integer value) {
            addCriterion("er_id =", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idNotEqualTo(Integer value) {
            addCriterion("er_id <>", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idGreaterThan(Integer value) {
            addCriterion("er_id >", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("er_id >=", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idLessThan(Integer value) {
            addCriterion("er_id <", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idLessThanOrEqualTo(Integer value) {
            addCriterion("er_id <=", value, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idIn(List<Integer> values) {
            addCriterion("er_id in", values, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idNotIn(List<Integer> values) {
            addCriterion("er_id not in", values, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idBetween(Integer value1, Integer value2) {
            addCriterion("er_id between", value1, value2, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("er_id not between", value1, value2, "er_id");
            return (Criteria) this;
        }

        public Criteria andEr_studentIsNull() {
            addCriterion("er_student is null");
            return (Criteria) this;
        }

        public Criteria andEr_studentIsNotNull() {
            addCriterion("er_student is not null");
            return (Criteria) this;
        }

        public Criteria andEr_studentEqualTo(Integer value) {
            addCriterion("er_student =", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentNotEqualTo(Integer value) {
            addCriterion("er_student <>", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentGreaterThan(Integer value) {
            addCriterion("er_student >", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentGreaterThanOrEqualTo(Integer value) {
            addCriterion("er_student >=", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentLessThan(Integer value) {
            addCriterion("er_student <", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentLessThanOrEqualTo(Integer value) {
            addCriterion("er_student <=", value, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentIn(List<Integer> values) {
            addCriterion("er_student in", values, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentNotIn(List<Integer> values) {
            addCriterion("er_student not in", values, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentBetween(Integer value1, Integer value2) {
            addCriterion("er_student between", value1, value2, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_studentNotBetween(Integer value1, Integer value2) {
            addCriterion("er_student not between", value1, value2, "er_student");
            return (Criteria) this;
        }

        public Criteria andEr_subjectIsNull() {
            addCriterion("er_subject is null");
            return (Criteria) this;
        }

        public Criteria andEr_subjectIsNotNull() {
            addCriterion("er_subject is not null");
            return (Criteria) this;
        }

        public Criteria andEr_subjectEqualTo(Integer value) {
            addCriterion("er_subject =", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectNotEqualTo(Integer value) {
            addCriterion("er_subject <>", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectGreaterThan(Integer value) {
            addCriterion("er_subject >", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("er_subject >=", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectLessThan(Integer value) {
            addCriterion("er_subject <", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectLessThanOrEqualTo(Integer value) {
            addCriterion("er_subject <=", value, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectIn(List<Integer> values) {
            addCriterion("er_subject in", values, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectNotIn(List<Integer> values) {
            addCriterion("er_subject not in", values, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectBetween(Integer value1, Integer value2) {
            addCriterion("er_subject between", value1, value2, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_subjectNotBetween(Integer value1, Integer value2) {
            addCriterion("er_subject not between", value1, value2, "er_subject");
            return (Criteria) this;
        }

        public Criteria andEr_scoreIsNull() {
            addCriterion("er_score is null");
            return (Criteria) this;
        }

        public Criteria andEr_scoreIsNotNull() {
            addCriterion("er_score is not null");
            return (Criteria) this;
        }

        public Criteria andEr_scoreEqualTo(Float value) {
            addCriterion("er_score =", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreNotEqualTo(Float value) {
            addCriterion("er_score <>", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreGreaterThan(Float value) {
            addCriterion("er_score >", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreGreaterThanOrEqualTo(Float value) {
            addCriterion("er_score >=", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreLessThan(Float value) {
            addCriterion("er_score <", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreLessThanOrEqualTo(Float value) {
            addCriterion("er_score <=", value, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreIn(List<Float> values) {
            addCriterion("er_score in", values, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreNotIn(List<Float> values) {
            addCriterion("er_score not in", values, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreBetween(Float value1, Float value2) {
            addCriterion("er_score between", value1, value2, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_scoreNotBetween(Float value1, Float value2) {
            addCriterion("er_score not between", value1, value2, "er_score");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeIsNull() {
            addCriterion("er_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeIsNotNull() {
            addCriterion("er_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeEqualTo(Date value) {
            addCriterion("er_create_time =", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeNotEqualTo(Date value) {
            addCriterion("er_create_time <>", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeGreaterThan(Date value) {
            addCriterion("er_create_time >", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("er_create_time >=", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeLessThan(Date value) {
            addCriterion("er_create_time <", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeLessThanOrEqualTo(Date value) {
            addCriterion("er_create_time <=", value, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeIn(List<Date> values) {
            addCriterion("er_create_time in", values, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeNotIn(List<Date> values) {
            addCriterion("er_create_time not in", values, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeBetween(Date value1, Date value2) {
            addCriterion("er_create_time between", value1, value2, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_create_timeNotBetween(Date value1, Date value2) {
            addCriterion("er_create_time not between", value1, value2, "er_create_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeIsNull() {
            addCriterion("er_update_time is null");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeIsNotNull() {
            addCriterion("er_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeEqualTo(Date value) {
            addCriterion("er_update_time =", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeNotEqualTo(Date value) {
            addCriterion("er_update_time <>", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeGreaterThan(Date value) {
            addCriterion("er_update_time >", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("er_update_time >=", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeLessThan(Date value) {
            addCriterion("er_update_time <", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeLessThanOrEqualTo(Date value) {
            addCriterion("er_update_time <=", value, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeIn(List<Date> values) {
            addCriterion("er_update_time in", values, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeNotIn(List<Date> values) {
            addCriterion("er_update_time not in", values, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeBetween(Date value1, Date value2) {
            addCriterion("er_update_time between", value1, value2, "er_update_time");
            return (Criteria) this;
        }

        public Criteria andEr_update_timeNotBetween(Date value1, Date value2) {
            addCriterion("er_update_time not between", value1, value2, "er_update_time");
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