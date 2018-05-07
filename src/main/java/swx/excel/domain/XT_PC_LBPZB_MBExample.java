package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XT_PC_LBPZB_MBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XT_PC_LBPZB_MBExample() {
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

        public Criteria andPclbBmIsNull() {
            addCriterion("PCLB_BM is null");
            return (Criteria) this;
        }

        public Criteria andPclbBmIsNotNull() {
            addCriterion("PCLB_BM is not null");
            return (Criteria) this;
        }

        public Criteria andPclbBmEqualTo(String value) {
            addCriterion("PCLB_BM =", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotEqualTo(String value) {
            addCriterion("PCLB_BM <>", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmGreaterThan(String value) {
            addCriterion("PCLB_BM >", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmGreaterThanOrEqualTo(String value) {
            addCriterion("PCLB_BM >=", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLessThan(String value) {
            addCriterion("PCLB_BM <", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLessThanOrEqualTo(String value) {
            addCriterion("PCLB_BM <=", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLike(String value) {
            addCriterion("PCLB_BM like", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotLike(String value) {
            addCriterion("PCLB_BM not like", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmIn(List<String> values) {
            addCriterion("PCLB_BM in", values, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotIn(List<String> values) {
            addCriterion("PCLB_BM not in", values, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmBetween(String value1, String value2) {
            addCriterion("PCLB_BM between", value1, value2, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotBetween(String value1, String value2) {
            addCriterion("PCLB_BM not between", value1, value2, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbZmcIsNull() {
            addCriterion("PCLB_ZMC is null");
            return (Criteria) this;
        }

        public Criteria andPclbZmcIsNotNull() {
            addCriterion("PCLB_ZMC is not null");
            return (Criteria) this;
        }

        public Criteria andPclbZmcEqualTo(String value) {
            addCriterion("PCLB_ZMC =", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcNotEqualTo(String value) {
            addCriterion("PCLB_ZMC <>", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcGreaterThan(String value) {
            addCriterion("PCLB_ZMC >", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcGreaterThanOrEqualTo(String value) {
            addCriterion("PCLB_ZMC >=", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcLessThan(String value) {
            addCriterion("PCLB_ZMC <", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcLessThanOrEqualTo(String value) {
            addCriterion("PCLB_ZMC <=", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcLike(String value) {
            addCriterion("PCLB_ZMC like", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcNotLike(String value) {
            addCriterion("PCLB_ZMC not like", value, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcIn(List<String> values) {
            addCriterion("PCLB_ZMC in", values, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcNotIn(List<String> values) {
            addCriterion("PCLB_ZMC not in", values, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcBetween(String value1, String value2) {
            addCriterion("PCLB_ZMC between", value1, value2, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbZmcNotBetween(String value1, String value2) {
            addCriterion("PCLB_ZMC not between", value1, value2, "pclbZmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcIsNull() {
            addCriterion("PCLB_CMC is null");
            return (Criteria) this;
        }

        public Criteria andPclbCmcIsNotNull() {
            addCriterion("PCLB_CMC is not null");
            return (Criteria) this;
        }

        public Criteria andPclbCmcEqualTo(String value) {
            addCriterion("PCLB_CMC =", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcNotEqualTo(String value) {
            addCriterion("PCLB_CMC <>", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcGreaterThan(String value) {
            addCriterion("PCLB_CMC >", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcGreaterThanOrEqualTo(String value) {
            addCriterion("PCLB_CMC >=", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcLessThan(String value) {
            addCriterion("PCLB_CMC <", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcLessThanOrEqualTo(String value) {
            addCriterion("PCLB_CMC <=", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcLike(String value) {
            addCriterion("PCLB_CMC like", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcNotLike(String value) {
            addCriterion("PCLB_CMC not like", value, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcIn(List<String> values) {
            addCriterion("PCLB_CMC in", values, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcNotIn(List<String> values) {
            addCriterion("PCLB_CMC not in", values, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcBetween(String value1, String value2) {
            addCriterion("PCLB_CMC between", value1, value2, "pclbCmc");
            return (Criteria) this;
        }

        public Criteria andPclbCmcNotBetween(String value1, String value2) {
            addCriterion("PCLB_CMC not between", value1, value2, "pclbCmc");
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

        public Criteria andPclbBzIsNull() {
            addCriterion("PCLB_BZ is null");
            return (Criteria) this;
        }

        public Criteria andPclbBzIsNotNull() {
            addCriterion("PCLB_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andPclbBzEqualTo(String value) {
            addCriterion("PCLB_BZ =", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzNotEqualTo(String value) {
            addCriterion("PCLB_BZ <>", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzGreaterThan(String value) {
            addCriterion("PCLB_BZ >", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzGreaterThanOrEqualTo(String value) {
            addCriterion("PCLB_BZ >=", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzLessThan(String value) {
            addCriterion("PCLB_BZ <", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzLessThanOrEqualTo(String value) {
            addCriterion("PCLB_BZ <=", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzLike(String value) {
            addCriterion("PCLB_BZ like", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzNotLike(String value) {
            addCriterion("PCLB_BZ not like", value, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzIn(List<String> values) {
            addCriterion("PCLB_BZ in", values, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzNotIn(List<String> values) {
            addCriterion("PCLB_BZ not in", values, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzBetween(String value1, String value2) {
            addCriterion("PCLB_BZ between", value1, value2, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andPclbBzNotBetween(String value1, String value2) {
            addCriterion("PCLB_BZ not between", value1, value2, "pclbBz");
            return (Criteria) this;
        }

        public Criteria andSxIsNull() {
            addCriterion("SX is null");
            return (Criteria) this;
        }

        public Criteria andSxIsNotNull() {
            addCriterion("SX is not null");
            return (Criteria) this;
        }

        public Criteria andSxEqualTo(BigDecimal value) {
            addCriterion("SX =", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotEqualTo(BigDecimal value) {
            addCriterion("SX <>", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThan(BigDecimal value) {
            addCriterion("SX >", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SX >=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThan(BigDecimal value) {
            addCriterion("SX <", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SX <=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxIn(List<BigDecimal> values) {
            addCriterion("SX in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotIn(List<BigDecimal> values) {
            addCriterion("SX not in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SX between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SX not between", value1, value2, "sx");
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

        public Criteria andPcFlbmIsNull() {
            addCriterion("PC_FLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcFlbmIsNotNull() {
            addCriterion("PC_FLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcFlbmEqualTo(String value) {
            addCriterion("PC_FLBM =", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmNotEqualTo(String value) {
            addCriterion("PC_FLBM <>", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmGreaterThan(String value) {
            addCriterion("PC_FLBM >", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmGreaterThanOrEqualTo(String value) {
            addCriterion("PC_FLBM >=", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmLessThan(String value) {
            addCriterion("PC_FLBM <", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmLessThanOrEqualTo(String value) {
            addCriterion("PC_FLBM <=", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmLike(String value) {
            addCriterion("PC_FLBM like", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmNotLike(String value) {
            addCriterion("PC_FLBM not like", value, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmIn(List<String> values) {
            addCriterion("PC_FLBM in", values, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmNotIn(List<String> values) {
            addCriterion("PC_FLBM not in", values, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmBetween(String value1, String value2) {
            addCriterion("PC_FLBM between", value1, value2, "pcFlbm");
            return (Criteria) this;
        }

        public Criteria andPcFlbmNotBetween(String value1, String value2) {
            addCriterion("PC_FLBM not between", value1, value2, "pcFlbm");
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