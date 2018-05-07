package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AjpcPcxflExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AjpcPcxflExample() {
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

        public Criteria andPcxflbmIsNull() {
            addCriterion("PCXFLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcxflbmIsNotNull() {
            addCriterion("PCXFLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflbmEqualTo(String value) {
            addCriterion("PCXFLBM =", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotEqualTo(String value) {
            addCriterion("PCXFLBM <>", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmGreaterThan(String value) {
            addCriterion("PCXFLBM >", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFLBM >=", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLessThan(String value) {
            addCriterion("PCXFLBM <", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLessThanOrEqualTo(String value) {
            addCriterion("PCXFLBM <=", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLike(String value) {
            addCriterion("PCXFLBM like", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotLike(String value) {
            addCriterion("PCXFLBM not like", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmIn(List<String> values) {
            addCriterion("PCXFLBM in", values, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotIn(List<String> values) {
            addCriterion("PCXFLBM not in", values, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmBetween(String value1, String value2) {
            addCriterion("PCXFLBM between", value1, value2, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotBetween(String value1, String value2) {
            addCriterion("PCXFLBM not between", value1, value2, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflmcIsNull() {
            addCriterion("PCXFLMC is null");
            return (Criteria) this;
        }

        public Criteria andPcxflmcIsNotNull() {
            addCriterion("PCXFLMC is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflmcEqualTo(String value) {
            addCriterion("PCXFLMC =", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcNotEqualTo(String value) {
            addCriterion("PCXFLMC <>", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcGreaterThan(String value) {
            addCriterion("PCXFLMC >", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFLMC >=", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcLessThan(String value) {
            addCriterion("PCXFLMC <", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcLessThanOrEqualTo(String value) {
            addCriterion("PCXFLMC <=", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcLike(String value) {
            addCriterion("PCXFLMC like", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcNotLike(String value) {
            addCriterion("PCXFLMC not like", value, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcIn(List<String> values) {
            addCriterion("PCXFLMC in", values, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcNotIn(List<String> values) {
            addCriterion("PCXFLMC not in", values, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcBetween(String value1, String value2) {
            addCriterion("PCXFLMC between", value1, value2, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflmcNotBetween(String value1, String value2) {
            addCriterion("PCXFLMC not between", value1, value2, "pcxflmc");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmIsNull() {
            addCriterion("PCXFLFBM is null");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmIsNotNull() {
            addCriterion("PCXFLFBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmEqualTo(String value) {
            addCriterion("PCXFLFBM =", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmNotEqualTo(String value) {
            addCriterion("PCXFLFBM <>", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmGreaterThan(String value) {
            addCriterion("PCXFLFBM >", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFLFBM >=", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmLessThan(String value) {
            addCriterion("PCXFLFBM <", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmLessThanOrEqualTo(String value) {
            addCriterion("PCXFLFBM <=", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmLike(String value) {
            addCriterion("PCXFLFBM like", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmNotLike(String value) {
            addCriterion("PCXFLFBM not like", value, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmIn(List<String> values) {
            addCriterion("PCXFLFBM in", values, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmNotIn(List<String> values) {
            addCriterion("PCXFLFBM not in", values, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmBetween(String value1, String value2) {
            addCriterion("PCXFLFBM between", value1, value2, "pcxflfbm");
            return (Criteria) this;
        }

        public Criteria andPcxflfbmNotBetween(String value1, String value2) {
            addCriterion("PCXFLFBM not between", value1, value2, "pcxflfbm");
            return (Criteria) this;
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

        public Criteria andPcjlbmIsNull() {
            addCriterion("PCJLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcjlbmIsNotNull() {
            addCriterion("PCJLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcjlbmEqualTo(String value) {
            addCriterion("PCJLBM =", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotEqualTo(String value) {
            addCriterion("PCJLBM <>", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmGreaterThan(String value) {
            addCriterion("PCJLBM >", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCJLBM >=", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLessThan(String value) {
            addCriterion("PCJLBM <", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLessThanOrEqualTo(String value) {
            addCriterion("PCJLBM <=", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLike(String value) {
            addCriterion("PCJLBM like", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotLike(String value) {
            addCriterion("PCJLBM not like", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmIn(List<String> values) {
            addCriterion("PCJLBM in", values, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotIn(List<String> values) {
            addCriterion("PCJLBM not in", values, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmBetween(String value1, String value2) {
            addCriterion("PCJLBM between", value1, value2, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotBetween(String value1, String value2) {
            addCriterion("PCJLBM not between", value1, value2, "pcjlbm");
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

        public Criteria andSftjIsNull() {
            addCriterion("SFTJ is null");
            return (Criteria) this;
        }

        public Criteria andSftjIsNotNull() {
            addCriterion("SFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andSftjEqualTo(String value) {
            addCriterion("SFTJ =", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotEqualTo(String value) {
            addCriterion("SFTJ <>", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThan(String value) {
            addCriterion("SFTJ >", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThanOrEqualTo(String value) {
            addCriterion("SFTJ >=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThan(String value) {
            addCriterion("SFTJ <", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThanOrEqualTo(String value) {
            addCriterion("SFTJ <=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLike(String value) {
            addCriterion("SFTJ like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotLike(String value) {
            addCriterion("SFTJ not like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjIn(List<String> values) {
            addCriterion("SFTJ in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotIn(List<String> values) {
            addCriterion("SFTJ not in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjBetween(String value1, String value2) {
            addCriterion("SFTJ between", value1, value2, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotBetween(String value1, String value2) {
            addCriterion("SFTJ not between", value1, value2, "sftj");
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

        public Criteria andMrzIsNull() {
            addCriterion("MRZ is null");
            return (Criteria) this;
        }

        public Criteria andMrzIsNotNull() {
            addCriterion("MRZ is not null");
            return (Criteria) this;
        }

        public Criteria andMrzEqualTo(String value) {
            addCriterion("MRZ =", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotEqualTo(String value) {
            addCriterion("MRZ <>", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThan(String value) {
            addCriterion("MRZ >", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThanOrEqualTo(String value) {
            addCriterion("MRZ >=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThan(String value) {
            addCriterion("MRZ <", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThanOrEqualTo(String value) {
            addCriterion("MRZ <=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLike(String value) {
            addCriterion("MRZ like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotLike(String value) {
            addCriterion("MRZ not like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzIn(List<String> values) {
            addCriterion("MRZ in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotIn(List<String> values) {
            addCriterion("MRZ not in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzBetween(String value1, String value2) {
            addCriterion("MRZ between", value1, value2, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotBetween(String value1, String value2) {
            addCriterion("MRZ not between", value1, value2, "mrz");
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