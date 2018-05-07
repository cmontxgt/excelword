package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AjXtPcMbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AjXtPcMbExample() {
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

        public Criteria andPcmbbmIsNull() {
            addCriterion("PCMBBM is null");
            return (Criteria) this;
        }

        public Criteria andPcmbbmIsNotNull() {
            addCriterion("PCMBBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcmbbmEqualTo(String value) {
            addCriterion("PCMBBM =", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotEqualTo(String value) {
            addCriterion("PCMBBM <>", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmGreaterThan(String value) {
            addCriterion("PCMBBM >", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCMBBM >=", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLessThan(String value) {
            addCriterion("PCMBBM <", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLessThanOrEqualTo(String value) {
            addCriterion("PCMBBM <=", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLike(String value) {
            addCriterion("PCMBBM like", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotLike(String value) {
            addCriterion("PCMBBM not like", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmIn(List<String> values) {
            addCriterion("PCMBBM in", values, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotIn(List<String> values) {
            addCriterion("PCMBBM not in", values, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmBetween(String value1, String value2) {
            addCriterion("PCMBBM between", value1, value2, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotBetween(String value1, String value2) {
            addCriterion("PCMBBM not between", value1, value2, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbmcIsNull() {
            addCriterion("PCMBMC is null");
            return (Criteria) this;
        }

        public Criteria andPcmbmcIsNotNull() {
            addCriterion("PCMBMC is not null");
            return (Criteria) this;
        }

        public Criteria andPcmbmcEqualTo(String value) {
            addCriterion("PCMBMC =", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcNotEqualTo(String value) {
            addCriterion("PCMBMC <>", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcGreaterThan(String value) {
            addCriterion("PCMBMC >", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcGreaterThanOrEqualTo(String value) {
            addCriterion("PCMBMC >=", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcLessThan(String value) {
            addCriterion("PCMBMC <", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcLessThanOrEqualTo(String value) {
            addCriterion("PCMBMC <=", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcLike(String value) {
            addCriterion("PCMBMC like", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcNotLike(String value) {
            addCriterion("PCMBMC not like", value, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcIn(List<String> values) {
            addCriterion("PCMBMC in", values, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcNotIn(List<String> values) {
            addCriterion("PCMBMC not in", values, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcBetween(String value1, String value2) {
            addCriterion("PCMBMC between", value1, value2, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andPcmbmcNotBetween(String value1, String value2) {
            addCriterion("PCMBMC not between", value1, value2, "pcmbmc");
            return (Criteria) this;
        }

        public Criteria andDwbmIsNull() {
            addCriterion("DWBM is null");
            return (Criteria) this;
        }

        public Criteria andDwbmIsNotNull() {
            addCriterion("DWBM is not null");
            return (Criteria) this;
        }

        public Criteria andDwbmEqualTo(String value) {
            addCriterion("DWBM =", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotEqualTo(String value) {
            addCriterion("DWBM <>", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmGreaterThan(String value) {
            addCriterion("DWBM >", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmGreaterThanOrEqualTo(String value) {
            addCriterion("DWBM >=", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLessThan(String value) {
            addCriterion("DWBM <", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLessThanOrEqualTo(String value) {
            addCriterion("DWBM <=", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLike(String value) {
            addCriterion("DWBM like", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotLike(String value) {
            addCriterion("DWBM not like", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmIn(List<String> values) {
            addCriterion("DWBM in", values, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotIn(List<String> values) {
            addCriterion("DWBM not in", values, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmBetween(String value1, String value2) {
            addCriterion("DWBM between", value1, value2, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotBetween(String value1, String value2) {
            addCriterion("DWBM not between", value1, value2, "dwbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmIsNull() {
            addCriterion("PCFLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcflbmIsNotNull() {
            addCriterion("PCFLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcflbmEqualTo(String value) {
            addCriterion("PCFLBM =", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmNotEqualTo(String value) {
            addCriterion("PCFLBM <>", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmGreaterThan(String value) {
            addCriterion("PCFLBM >", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCFLBM >=", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmLessThan(String value) {
            addCriterion("PCFLBM <", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmLessThanOrEqualTo(String value) {
            addCriterion("PCFLBM <=", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmLike(String value) {
            addCriterion("PCFLBM like", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmNotLike(String value) {
            addCriterion("PCFLBM not like", value, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmIn(List<String> values) {
            addCriterion("PCFLBM in", values, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmNotIn(List<String> values) {
            addCriterion("PCFLBM not in", values, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmBetween(String value1, String value2) {
            addCriterion("PCFLBM between", value1, value2, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andPcflbmNotBetween(String value1, String value2) {
            addCriterion("PCFLBM not between", value1, value2, "pcflbm");
            return (Criteria) this;
        }

        public Criteria andSfqyIsNull() {
            addCriterion("SFQY is null");
            return (Criteria) this;
        }

        public Criteria andSfqyIsNotNull() {
            addCriterion("SFQY is not null");
            return (Criteria) this;
        }

        public Criteria andSfqyEqualTo(String value) {
            addCriterion("SFQY =", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyNotEqualTo(String value) {
            addCriterion("SFQY <>", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyGreaterThan(String value) {
            addCriterion("SFQY >", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyGreaterThanOrEqualTo(String value) {
            addCriterion("SFQY >=", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyLessThan(String value) {
            addCriterion("SFQY <", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyLessThanOrEqualTo(String value) {
            addCriterion("SFQY <=", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyLike(String value) {
            addCriterion("SFQY like", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyNotLike(String value) {
            addCriterion("SFQY not like", value, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyIn(List<String> values) {
            addCriterion("SFQY in", values, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyNotIn(List<String> values) {
            addCriterion("SFQY not in", values, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyBetween(String value1, String value2) {
            addCriterion("SFQY between", value1, value2, "sfqy");
            return (Criteria) this;
        }

        public Criteria andSfqyNotBetween(String value1, String value2) {
            addCriterion("SFQY not between", value1, value2, "sfqy");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(BigDecimal value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(BigDecimal value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(BigDecimal value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(BigDecimal value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<BigDecimal> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<BigDecimal> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andSmIsNull() {
            addCriterion("SM is null");
            return (Criteria) this;
        }

        public Criteria andSmIsNotNull() {
            addCriterion("SM is not null");
            return (Criteria) this;
        }

        public Criteria andSmEqualTo(String value) {
            addCriterion("SM =", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotEqualTo(String value) {
            addCriterion("SM <>", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThan(String value) {
            addCriterion("SM >", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThanOrEqualTo(String value) {
            addCriterion("SM >=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThan(String value) {
            addCriterion("SM <", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThanOrEqualTo(String value) {
            addCriterion("SM <=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLike(String value) {
            addCriterion("SM like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotLike(String value) {
            addCriterion("SM not like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmIn(List<String> values) {
            addCriterion("SM in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotIn(List<String> values) {
            addCriterion("SM not in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmBetween(String value1, String value2) {
            addCriterion("SM between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotBetween(String value1, String value2) {
            addCriterion("SM not between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andPcmblxIsNull() {
            addCriterion("PCMBLX is null");
            return (Criteria) this;
        }

        public Criteria andPcmblxIsNotNull() {
            addCriterion("PCMBLX is not null");
            return (Criteria) this;
        }

        public Criteria andPcmblxEqualTo(String value) {
            addCriterion("PCMBLX =", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxNotEqualTo(String value) {
            addCriterion("PCMBLX <>", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxGreaterThan(String value) {
            addCriterion("PCMBLX >", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxGreaterThanOrEqualTo(String value) {
            addCriterion("PCMBLX >=", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxLessThan(String value) {
            addCriterion("PCMBLX <", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxLessThanOrEqualTo(String value) {
            addCriterion("PCMBLX <=", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxLike(String value) {
            addCriterion("PCMBLX like", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxNotLike(String value) {
            addCriterion("PCMBLX not like", value, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxIn(List<String> values) {
            addCriterion("PCMBLX in", values, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxNotIn(List<String> values) {
            addCriterion("PCMBLX not in", values, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxBetween(String value1, String value2) {
            addCriterion("PCMBLX between", value1, value2, "pcmblx");
            return (Criteria) this;
        }

        public Criteria andPcmblxNotBetween(String value1, String value2) {
            addCriterion("PCMBLX not between", value1, value2, "pcmblx");
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